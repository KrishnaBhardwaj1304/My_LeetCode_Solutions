class Solution {
    public String reverseWords(String s) {
       s = s.trim();

        StringBuilder ans = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != ' ') {
                word.append(ch);
            } else {
                // add word only if not empty
                if (word.length() > 0) {
                    if (ans.length() == 0) {
                        ans.insert(0, word.toString());
                    } else {
                        ans.insert(0, word.toString() + " ");
                    }
                    word.setLength(0); // make word empty
                }
            }
        }

        // add the last word
        if (word.length() > 0) {
            if (ans.length() == 0) {
                ans.insert(0, word.toString());
            } else {
                ans.insert(0, word.toString() + " ");
            }
        }

        return ans.toString();
    }
}