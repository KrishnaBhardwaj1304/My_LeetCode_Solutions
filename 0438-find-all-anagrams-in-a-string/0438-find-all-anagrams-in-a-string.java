import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (p.length() > s.length()) return result;

        int[] need = new int[26];
        int[] window = new int[26];

        for (char ch : p.toCharArray()) {
            need[ch - 'a']++;
        }

        int k = p.length();

        for (int right = 0; right < s.length(); right++) {
            window[s.charAt(right) - 'a']++;

            // Remove the character that falls out of the window.
            if (right >= k) {
                window[s.charAt(right - k) - 'a']--;
            }

            if (right >= k - 1 && matches(window, need)) {
                result.add(right - k + 1);
            }
        }

        return result;
    }

    private boolean matches(int[] window, int[] need) {
        for (int i = 0; i < 26; i++) {
            if (window[i] != need[i]) return false;
        }
        return true;
    }
}