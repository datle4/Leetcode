class Solution {
public:
    int reverse(int x) {
        long rev = 0;
        while (x != 0)
        {
            rev = rev*10 + x%10;
            x = x / 10;
        }
        if (INT_MIN >= rev || rev >= INT_MAX)
            return 0;
        return rev;
    }
};