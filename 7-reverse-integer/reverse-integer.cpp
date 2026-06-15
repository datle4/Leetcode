class Solution {
public:
    int reverse(int x) {
        long rev = 0;
        int temp = x;
        while (temp != 0)
        {
            rev = rev*10 + temp%10;
            temp = temp / 10;
        }
        if (INT_MIN >= rev || rev >= INT_MAX)
            return 0;
        return rev;
    }
};