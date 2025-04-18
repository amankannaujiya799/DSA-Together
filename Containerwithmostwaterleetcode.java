class Solution {
    public int maxArea(int[] height) {
        int max = 0, left = 0, right = height.length - 1;

        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, area);

            if (height[left] < height[right]) left++;
            else right--;
        }

        return max;
    }
        
    }