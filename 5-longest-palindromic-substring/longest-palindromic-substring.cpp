class Solution {
public:
    void expandS (string& s, int left, int right, int& start, int& ex)
    {
        int size = s.length();
        while (right<size && left>=0 && s[left] == s[right])
        {
            right++;
            left--;
        }

        int len = right - left - 1;
        int begin = left + 1;

        if (ex < len)
        {
            ex = len;
            start = begin;
        }
    }

    string longestPalindrome(string s) {
        int n = s.length();
        if (n==1) return s;

        int start = 0;
        int ex = 1;

        for (int i=0; i<n; i++)
        {
            expandS(s, i, i, start, ex);
            expandS(s, i, i+1, start, ex);
        }    

        string result = "";
        for (int i = start; i < start+ex; i++)
            result += s[i];

        return result;
    }
};