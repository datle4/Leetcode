class Solution {
    public void reverseString(char[] s) {
        int right = s.length - 1;
        for (int i = 0; i < right; i++) {
            char c = s[i];
            s[i] = s[right];
            s[right] = c;
            right--;
        }   
    }
}