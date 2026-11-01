class Solution {
    public void reverseArray(int[] nums, int left, int right) {
        while (left <= right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public void rotate(int[] nums, int k) {
        int rotate = k % nums.length;
        if (nums.length == 0) {
            return;
        }
        if (rotate == 0) {
            return;
        }
        reverseArray(nums, 0, nums.length-1);
        reverseArray(nums, 0, rotate-1);
        reverseArray(nums, rotate, nums.length-1);
    }
}