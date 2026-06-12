class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        if (nums1.size() > nums2.size())
            return findMedianSortedArrays(nums2, nums1);

        vector<int>& A = nums1;
        vector<int>& B = nums2;

        int m = A.size();
        int n = B.size();

        int left = 0;
        int right = m;

        while (left <= right)
        {
            int i = (left+right)/2;
            int j = (m+n+1)/2 - i;

            int Aleft = (i == 0) ? INT_MIN : A[i-1];
            int Aright = (i == m) ? INT_MAX : A[i];

            int Bleft = (j == 0) ? INT_MIN : B[j-1];
            int Bright = (j == n) ? INT_MAX : B[j];

            if (Aleft <= Bright && Aright >= Bleft)
            {
                if ((m+n)%2==0)
                    return(max(Aleft, Bleft) + min(Aright, Bright)) / 2.0;
                else
                    return(max(Bleft, Aleft));
            }
            else if (Aleft > Bright)
                right = i-1;
            else
                left = i+1;
        }
        
        return 0.0;
    }
};