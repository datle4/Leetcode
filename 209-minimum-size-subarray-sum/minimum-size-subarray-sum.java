class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int left = 0;
        int total = 0;

        for (int right = 0; right < nums.length; right++) {
            total = total + nums[right];
            
            while (total >= target && left < nums.length) {
                result = Math.min(result, right-left+1);
                total = total - nums[left];
                left++;
            }
        }

        return result != Integer.MAX_VALUE ? result : 0;
    }
}