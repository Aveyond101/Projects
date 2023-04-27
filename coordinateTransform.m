%Author: Vincent Okafor
%2023-04-19

%%%%%%%%%%%%%% CAMERA INTRINSICS %%%%%%%%%%%%%%%%%%%%
video = VideoReader('Finalvideo2.mp4');

frame = video.NumFrames;

for i= 1:20
    %read each frame of the video
    e = readFrame(video);
    %save each frame as an image in the directory
    imwrite(e,['C:\Users\jnr4s\Documents\MATLAB\Part3\image_',num2str(i),'.jpg'])
    
end

%Create video writer object
v = VideoWriter('Output','MPEG-4');
open(v)
folderName = 'C:\Users\jnr4s\Documents\MATLAB\Part3';

imageDataSet = imageSet(folderName);

imageFileNames = imageDataSet.ImageLocation;


[imagePoints_camera, boardSize, imagesUsed] = detectCheckerboardPoints(imageFileNames);

squareSize = 24; %board size in mm

%Select image at location 6
sizeimagesUsed = size(imageDataSet.ImageLocation,6);

%Generate the world coordinates of the corners of the squares.
camWorldPoints = generateCheckerboardPoints(boardSize, squareSize);


%Calibrate the camera.
imgRef = readimage(imageDataSet,1); 

imageSize = [size(imgRef,1), size(imgRef,2)];

cameraParams = estimateCameraParameters(imagePoints_camera, camWorldPoints, 'imageSize', imageSize);

intrinsics = cameraParams.Intrinsics;

%%%%%%%%%%%%%%%%%% CAMERA EXTRINSICS %%%%%%%%%%%%%%%%%

% esimate camera extrinsics
camExtrinsics = estimateExtrinsics(imagePoints_camera(:,:,1),camWorldPoints,intrinsics);

% extract rotation & translation matrices 
translationVector = camExtrinsics.Translation;
rotationMatrix = camExtrinsics.R;

% generate worldPoints matrix that will contain the x and y coordinates of 360 points that lie on a circle with a radius of r.
worldPoints = zeros(360,2);
r = 10;%in mm
for i =1:360
    worldPoints(i,1) = r*cos(i);
    worldPoints(i,2) = r*sin(i);
end

% read video of ball above the checkerboard
video = VideoReader('Finalvideo2.mp4');

% save the number of frames of the video
numberOfFrames = video.NumFrames;

%Create arrays of similar length as the video
Xc = zeros(numberOfFrames,1);
Yc = zeros(numberOfFrames,1);
Zc = zeros(numberOfFrames,1);
Cframe = zeros(numberOfFrames,1);


figure;
frameSize = [686, 868];

%%%%%%%%%%%%%%%% VIDEO LOOP %%%%%%%%%%%%%%%%%%%

for i=1:numberOfFrames
     e = read(video,i);
    %convert to grayscale
    vmgrey = rgb2gray(e);
    %converting to b&w
    vmbw = im2bw(vmgrey);
    [center, radius] = imfindcircles(vmbw,[32,40], 'ObjectPolarity','bright', 'Sensitivity',0.93);
    %function used to show each frame of the video as an image
   imagePoints = zeros(size(360,2));
    
   %creating an array imagePints containing the pixel coordinates and
   %creating an circle
    for j = 1:360
       imagePoints(j,1) = (radius * cos(j)) + center(1,1); 
       imagePoints(j,2) = (radius * sin(j)) + center(1,2);
    end
    
    %estimate extrinsics using intrinsics from the previous part
    ballExtrinsics = estimateExtrinsics(imagePoints, worldPoints, intrinsics);
    t = ballExtrinsics.Translation;
    
    Tcheckerboard_ball = inv(camExtrinsics.A)*ballExtrinsics.A;

    %save the translation x,y,z in X,Y,Z variables
    X = Tcheckerboard_ball(1,4)/10;
    Y = Tcheckerboard_ball(2,4)/10;
    Z = Tcheckerboard_ball(3,4)/10;
    % Define a world coordinate point to plot
    worldPoint = [0,0,0];

    % Transform the world coordinate point into the image coordinate points
    imagePoint = worldToImage(cameraParams, camExtrinsics.R  , camExtrinsics.Translation, worldPoint);

    worldPoint = [imagePoint(1),imagePoint(2), 0];
      
    %show image
    imshow(e);

    % Plot the image and the world coordinate point with the x, y, and z axes
    hold on;
 
    % Draw coordinates on the checkerboard
    quiver3(worldPoint(1), worldPoint(2), worldPoint(3), -50, 0, 0, 'r', 'LineWidth', 2);
    quiver3(worldPoint(1), worldPoint(2), worldPoint(3), 0, 50, 0, 'g', 'LineWidth', 2);
    quiver3(worldPoint(1), worldPoint(2), worldPoint(3), 0, 0, 50, 'b', 'LineWidth', 2);
    
    %plot a red line from the checkerboard to the ball center
    plot([imagePoint(1,1), center(1,1)], [imagePoint(1,2), center(1,2)], 'r');
    
    hold off;


    %draw straight line passing from the x axis 
    xline(center(1,1),'-.g');
    
    %draw straight line passing from the y axis
    yline(center(1,2),'-.g');
    hold on;
    
    %plot the actual x and y coordinate with * in the video
    scatter(center(1,1), center(1,2),'*');

    hold on;
    Cframe(i,1) = i;

    %saving the x coordinate values 
    Xc(i,1) = X;
    %saving the y coordinate values 
    Yc(i,1) = Y;
    %saving the radius values 
    Zc(i,1) = Z;

    % print x y & r on each frame
    textString = sprintf('  X=%.2f cm\n  Y= %.2f cm\n  Z=%.2f cm', X, Y, Z);
    
    text(center(1,1), center(1,2), textString, 'FontSize', 5,'Color','w');
    
    viscircles(center, radius, 'EdgeColor','b');
    
    
    hold off; 
    img = getframe;
    imgvideo = imresize(img.cdata,frameSize);
   writeVideo(v,imgvideo)
end

% plot x y and radius
figure;
hold on;
plot(Cframe(1:end,1), Xc(1:end,1),"--ro"); 
ln = plot(Cframe(1:end,1), Yc(1:end,1));
ln.LineWidth = 0.5;
ln.Color = [0 0.5 0.5];
ln.Marker = 'o';
ln.MarkerEdgeColor = 'b';
mn = plot(Cframe(1:end,1), Zc(1:end,1),"g");
mn.LineWidth = 0.5;
mn.Color = [0 0.5 0.5];
mn.Marker = '*';
mn.MarkerEdgeColor = 'g';
xlabel('Frame #');
ylabel('Measurement (cm)');
legend('X','Y','Z');
fig = getframe();

saveas(gcf,'graph.jpg');
fig = imread('graph.jpg');
fig = imresize(fig, [686, 868]);
writeVideo(v,fig);
close(v);


