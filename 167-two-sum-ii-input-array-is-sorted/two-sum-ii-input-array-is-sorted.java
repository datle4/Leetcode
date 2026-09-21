class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int total = numbers[left] + numbers[right];
            if (total < target) {
                left++;
            }
            if (total > target) {
                right--;
            }
            if (total == target) {
                return new int[]{left+1, right+1};
            }
        }

        return new int[]{};
    }
}