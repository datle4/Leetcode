class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> hash;
        int result = 0;
        for (int i=0; i<nums.size(); i++)
        {
            int compo = target - nums[i];

            if (hash.find(compo) != hash.end())
                return {i, hash[compo]};
            
            hash[nums[i]] = i; 
        }
        return {};
    }
};