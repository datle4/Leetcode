class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder complete1 = new StringBuilder(word1.length);
        StringBuilder complete2 = new StringBuilder(word2.length);
        for (int i = 0; i < word1.length; i++) {
            complete1.append(word1[i]);
        }
        for (int i = 0; i < word2.length; i++) {
            complete2.append(word2[i]);
        }
        return complete1.toString().equals(complete2.toString());
    }
}