class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        unordered_set<char> hash;
        int length = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++)
        {
            while (hash.find(s[right]) != hash.end())
            {
                hash.erase(s[left]);
                left++;
            }
            hash.insert(s[right]);
            length = max (length, right-left+1);
        }
        
        return length;
    }
};