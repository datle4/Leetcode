class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] frequency = new int[101];
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            frequency[nums[i]] += 1;
        }

        for (int i = 1; i < frequency.length; i++) {
            frequency[i] += frequency[i-1]; 
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                result[i] = 0;
            }
            else {
                result[i] = frequency[nums[i]-1];
            }
        }

        return result;
    }
}