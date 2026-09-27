// class Solution {
//     public int minDays(int[] bloomDay, int m, int k) {
        
//     }
// }
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length) {
            return -1;
        }

        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;

        for (int day : bloomDay) {
            left = Math.min(left, day);
            right = Math.max(right, day);
        }

        while (left < right) {
            int day = left + (right - left) / 2;

            int bouquets = 0;
            int consecutive = 0;

            for (int bloom : bloomDay) {
                if (bloom <= day) {
                    consecutive++;

                    if (consecutive == k) {
                        bouquets++;
                        consecutive = 0;
                    }
                } else {
                    consecutive = 0;
                }
            }

            if (bouquets >= m) {
                right = day;       // This day works; try an earlier one.
            } else {
                left = day + 1;    // Need to wait longer.
            }
        }

        return left;
    }
}