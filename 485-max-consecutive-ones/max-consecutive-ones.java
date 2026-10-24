class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int temp = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                temp+=1;
            }
            else {
                temp = 0;
            }
            result = Math.max(result,temp);
        }

        return result;
    }
}