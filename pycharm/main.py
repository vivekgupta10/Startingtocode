import cv2
from matplotlib import pyplot as plt
img = cv2.imread('D:\img1.jpg')
plt.imshow(img)
plt.title('hello world')
plt.axis('off')
plt.show()
