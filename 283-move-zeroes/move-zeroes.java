class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length == 1) {
            return;
        }

        int slow = 0;

        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0) {
                int replace = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = replace;
                slow++;
            }  
        }
    }
}