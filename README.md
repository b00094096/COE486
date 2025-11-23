## YOLO-World Object Detection with Supervision

This Google Colab notebook demonstrates how to perform robust zero-shot object detection using the YOLO-World model, seamlessly integrated with the Supervision library. It provides a comprehensive workflow for both image and video analysis, showcasing advanced techniques for refining detection results.

### Features:

*   **Zero-Shot Object Detection**: Leverage the power of YOLO-World for open-vocabulary object detection, allowing you to detect objects not seen during training by simply defining their names.
*   **Supervision Integration**: Utilize the `supervision` library for efficient handling, annotation, and visualization of detection bounding boxes and labels.
*   **Configurable Confidence Thresholds**: Adjust the detection confidence to optimize for specific use cases, especially when dealing with novel classes where default thresholds might be too high.
*   **Non-Max Suppression (NMS)**: Apply NMS to eliminate redundant and overlapping bounding box detections, ensuring cleaner and more accurate results.
*   **Area-Based Filtering**: Filter detections based on their relative area within the frame, useful for ignoring very small or very large objects.
*   **Video Processing Pipeline**: Implement a full pipeline for processing video files, applying object detection frame-by-frame, and saving the annotated video output.

### Dependencies:

This notebook requires the following libraries:

*   `inference-gpu[yolo-world]==0.9.13`: For the YOLO-World model.
*   `supervision==0.19.0rc3`: For annotation and utility functions.
*   `opencv-python` (`cv2`):

These are installed at the beginning of the notebook using `!pip install` commands.

### How to Run:

1.  **Open in Google Colab**: Click the "Open in Colab" badge (if available) or upload the `.ipynb` file to your Google Drive and open it with Colaboratory.
2.  **Run All Cells**: Go to `Runtime` -> `Run all` to execute the entire notebook sequentially.
3.  **Inspect Results**: The notebook will display annotated images and save an annotated video (`yellow-filling-output.mp4`) in your Colab environment's home directory (`HOME`).
4.  **Modify and Experiment**: Feel free to change `SOURCE_IMAGE_PATH`, `SOURCE_VIDEO_PATH`, `classes`, `confidence` thresholds, and `NMS` parameters to experiment with different detection scenarios.
