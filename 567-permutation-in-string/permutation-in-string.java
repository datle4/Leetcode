class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        
        int left = 0;
        int[] freqS1 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            freqS1[s1.charAt(i) - 'a']++;
        }

        int[] freqS2 = new int[26];

        for (int right = 0; right < s2.length(); right++) {
            freqS2[s2.charAt(right)-'a']++;

            if (left < s2.length() && right - left + 1 > s1.length()) {
                freqS2[s2.charAt(left)-'a']--;
                left++;
            }

            if (Arrays.equals(freqS1, freqS2)) {
                return true;
            }
 
        }

        return false;
    }
}