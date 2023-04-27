% Authors: Vincent Okafor & Colin Mcclenaghan

% Opens the video file
video = VideoReader('ball_vid_5.MOV');

% Creates a VideoWriter object to save the output video
output_video = VideoWriter('output_video.mp4', 'MPEG-4');
open(output_video);

% Initializes the arrays to store the position (x and y of center) and size data
positions = [];
radii_list = [];

% Loop to go through each frame in the video
while hasFrame(video)
    % Reads each valid frame
    frame = readFrame(video);

    % Converts the frame to grayscale
    gray_image = rgb2gray(frame);

    % Finds circles in the image
    [centers,radii] = imfindcircles(frame,[200 220],'ObjectPolarity','dark','Sensitivity',0.98);

    % Stores the position and size data
    positions = [positions; centers];
    radii_list = [radii_list; radii];

    % Plots the circles on the frame as well as plots the centers x, y, and
    % radius values on circle 
    imshow(frame);
    viscircles(centers,radii);
    for i = 1:length(radii)
        text(centers(i,1)-radii(i), centers(i,2)+radii(i)+5, ['x: ', num2str(round(centers(i,1))), ', y: ', num2str(round(centers(i,2))), ', r: ', num2str(round(radii(i)))], 'Color', 'white');
    end

    % Writes the frame to the output video
    writeVideo(output_video, getframe(gcf));
end
% Closes the output video file
close(output_video);

% Saves the position and size data to a file
save('position_data.mat', 'positions', 'radii_list');

% Plots x and y position data
figure;
plot(positions(:,1), 'bo');
hold on;
plot(positions(:,2), 'rx');
title('Position Data');
xlabel('Frame Number');
ylabel('Position');
legend('X Position', 'Y Position');

% Plots radius data
figure;
plot(radii_list, 'ro');
title('Radius Data');
xlabel('Frame Number');
ylabel('Radius');

