class Solution {
    public int mySqrt(int x) {
        int start = 0;
        int end = x;
        int answer = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if ((long) mid * mid == x) {
                return mid;
            }

            if ((long) mid * mid < x) {
                answer = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return answer;
    }
}