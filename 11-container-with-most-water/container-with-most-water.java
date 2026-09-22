class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (right >= 0) {
            int temp = (right-left) * Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, temp);

            if (left < height.length && height[left] < height[right]) {
                left++;
            }
            else {
                right--;
            }

            System.out.println(left + " " + right + " " + maxArea);
        }

        return maxArea;
    }
}