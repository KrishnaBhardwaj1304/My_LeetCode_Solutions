class Solution {
    public int maximumLengthSubstring(String s) {
        int[] count = new int[26];
        int start = 0;
        int maxLength = 0;

        for (int end = 0; end < s.length(); end++) {
            char added = s.charAt(end);
            count[added - 'a']++;

            while (count[added - 'a'] > 2) {
                char removed = s.charAt(start);
                count[removed - 'a']--;
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}