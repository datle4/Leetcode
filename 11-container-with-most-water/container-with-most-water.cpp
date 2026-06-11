class Solution {
public:
    int maxArea(vector<int>& height) {
        int maxA = 0;
        int left = 0;
        int right = height.size() - 1;
        while (left < right)
        {
            maxA = max(maxA, (right-left)* min(height[right], height[left]));
            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return maxA;
    }
};