%Author: Vincent Okafor


% Check if there are any files in the target folder
folder_contents = dir('Calibration_Files');
num_files = length(folder_contents) - 2; % Subtract 2 for '.' and '..'

if num_files > 0
    disp('Warning: Folder already contains files. Existing files may be overwritten.')
end

% Read the video file
video = VideoReader('Checkerboard.mp4');

% Determine the total number of frames in the video file
num_frames = video.NumberOfFrames;

% Loop through each frame and save it as an image in the specified folder
for i = 1:num_frames
    % Read the ith frame of the video
    frame = read(video, i);
    
    % Create a filename for the ith frame
    filename = sprintf('frame_%04d.jpg', i);
    
    % Save the ith frame as an image in the specified folder
    imwrite(frame, fullfile('Calibration_Files', filename));
end





% Specify the folder containing the calibration images
calibrationFolder = 'calibration_Files';

% Create an imageDatastore for the calibration images
calibrationImages = imageDatastore(calibrationFolder);

%Create a cell array of file names of calibration images.
image_dir = 'C:\Users\Vincent Okafor\Documents\MATLAB\Calibration_Files'; % specify the directory containing the images
image_files = dir(fullfile(image_dir, '*.jpg')); % get a list of all .jpg files in the directory
image_file_names = {image_files.name}; % extract the file names from the file structure
image_file_paths = fullfile(image_dir, image_file_names); % create a cell array of full file paths



%Detect calibration pattern in the images.
[imagePoints,boardSize,imagesUsed] = detectCheckerboardPoints(image_file_paths, 'PartialDetections', false);



%Uncomment this to display detected points 
%{ 


% Check the length of the image name array
len = length(image_file_names);

%Display the detected points.
imageFileNames = image_file_paths(imagesUsed);
for i = 1:numel(imageFileNames)
  I = imread(imageFileNames{i});
  subplot(len, len, i);
  imshow(I);
  hold on;
  plot(imagePoints(:,1,i),imagePoints(:,2,i),'ro');
end

%}
imageFileNames = image_file_paths(imagesUsed);

%Generate the world coordinates of the corners of the squares.
squareSizeInMM = 15;
worldPoints = generateCheckerboardPoints(boardSize,squareSizeInMM);

%Calibrate the camera.
I = readimage(calibrationImages,1); 
imageSize = [size(I, 1),size(I, 2)];
params = estimateCameraParameters(imagePoints,worldPoints, ...
                                  'ImageSize',imageSize);
intrinsics = params.Intrinsics; 

%Visualize the calibration accuracy.
showReprojectionErrors(params);
saveas(gcf, 'image001.tif')

%Visualize camera extrinsics.
figure;
showExtrinsics(params)
drawnow;
saveas(gcf, 'image002.tif')

%Plot detected and reprojected points.
figure; 
imshow(imageFileNames{1}); 
hold on;
plot(imagePoints(:,1,1), imagePoints(:,2,1),'go');
plot(params.ReprojectedPoints(:,1,1),params.ReprojectedPoints(:,2,1),'r+');
legend('Detected Points','ReprojectedPoints');
hold off;
saveas(gcf, 'image003.tif')

%%%%% CAMERA EXTRINSICS %%%%%%%

%Detect the checkerboard corners in the images.
[imagePoints,boardSize] = detectCheckerboardPoints(image_file_paths);

%Load a random image at a new location.
imOrig = readimage(calibrationImages,9); 
figure 
imshow(imOrig)
title("Input Image")
saveas(gcf, 'image004.tif')

%Undistort the image.

[im,newOrigin] = undistortImage(imOrig,intrinsics,OutputView="full");


[imagePoints,boardSize] = detectCheckerboardPoints(im);


imagePoints = imagePoints+newOrigin;

camExtrinsics = estimateExtrinsics(imagePoints,worldPoints,intrinsics);

%%Calculate the camera pose.

camPose = extr2pose(camExtrinsics);
figure
plotCamera(AbsolutePose=camPose,Size=20);
hold on
pcshow([worldPoints,zeros(size(worldPoints,1),1)], ...
  VerticalAxisDir="down",MarkerSize=40);
saveas(gcf, 'image005.tif')


%%%%% STORE & PLOT ROTATION & TRANSLATION DATA %%%%%%
%get rotation 
rotation = camExtrinsics.R;

%get translation 
translation = camExtrinsics.Translation;

%plot rotation and translation
figure;
subplot(1,2,1);
plot(rotation);
title("Rotation");
subplot(1,2,2);
plot(translation);
title("Translation");
hold off;
saveas(gcf, 'image006.tif')


figure;
imshow(imOrig);

%add z coordinate to world points
zCoord = zeros(size(worldPoints,1),1);
worldPoints = [worldPoints zCoord];

%project world points back into original image

projectedPoints = world2img(worldPoints,camExtrinsics,intrinsics);
hold on;
%plot(projectedPoints(:,1),projectedPoints(:,2),"g*-");
plot(projectedPoints(1:2,1),projectedPoints(1:2,2),"y-");
plot(projectedPoints(1:11:12,1),projectedPoints(1:11:12,2),"g-");
legend("Projected Points");
hold off;
saveas(gcf, 'image007.tif')


%%%% OUTPUT TO VIDEO %%%%%

% Set up parameters for the video
outputVideo = VideoWriter('output.avi');
outputVideo.FrameRate = 30; % set the frame rate of the video to 30 frames per second

% Open the video writer
open(outputVideo);

% Load the images
imageFiles = dir('*.tif'); 
numFrames = length(imageFiles);
for i = 1:numFrames
    filename = fullfile(imageFiles(i).folder, imageFiles(i).name);
    img = imread(filename);

    % Resize the image to match the video frame size
    img = imresize(img, [834 1145]);
    
    % Write the image to the video
    writeVideo(outputVideo, img);
end

% Close the video writer
close(outputVideo);





