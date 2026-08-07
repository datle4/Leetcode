class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> remain = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            int subtract = target - nums[i];
            if (remain.containsKey(subtract)) {
                return new int[]{i, remain.get(subtract)};
            }
            remain.put(nums[i],i);
        }

        return new int[]{};
    }
}