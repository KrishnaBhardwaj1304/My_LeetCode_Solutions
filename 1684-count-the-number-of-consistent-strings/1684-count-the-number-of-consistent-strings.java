
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] isAllowed = new boolean[26];

        for (char ch : allowed.toCharArray()) {
            isAllowed[ch - 'a'] = true;
        }

        int count = 0;

        for (String word : words) {
            boolean consistent = true;

            for (char ch : word.toCharArray()) {
                if (!isAllowed[ch - 'a']) {
                    consistent = false;
                    break;
                }
            }

            if (consistent) {
                count++;
            }
        }

        return count;
    }
}