// class Solution {
//     public int compress(char[] chars) {
        
//     }
// }

class Solution {
    public int compress(char[] chars) {
        int read = 0;
        int write = 0;

        while (read < chars.length) {
            char current = chars[read];
            int start = read;

            // Count this character's consecutive run.
            while (read < chars.length && chars[read] == current) {
                read++;
            }

            int count = read - start;
            chars[write++] = current;

            // Write the count only when it is greater than 1.
            if (count > 1) {
                for (char digit : Integer.toString(count).toCharArray()) {
                    chars[write++] = digit;
                }
            }
        }

        return write;
    }
}