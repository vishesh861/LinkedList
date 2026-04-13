package arrays;

public class TrappingRainWater {

    public int maxArea(int[] height) {
       int left  = 0;
       int right = height.length-1;
       int maxVolume = 0;
       while (left < right) {
        int min = Integer.min(height[left], height[right]);
        int waterArea = min * (right - left);
        if (maxVolume < waterArea) {
            maxVolume = waterArea;
        }
        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
       }

       return maxVolume;
    }

}
