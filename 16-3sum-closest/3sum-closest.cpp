class Solution {
public:
    int threeSumClosest(vector<int>& nums, int target) {
        sort(nums.begin(), nums.end());
        int closest_sum = INT_MAX/2;

        for (int i=0; i< nums.size(); i++)
        {
            int left = i+1, right = nums.size()-1;
            while (left < right)
            {
                int cur = nums[i] + nums[left] + nums[right];
                if (abs(cur-target) < abs(closest_sum-target))
                    closest_sum = cur;
                if (cur < target)
                    ++left;
                else if (cur > target)
                    --right;
                else    
                    return cur;
            }
        }
        return closest_sum;
    }
};