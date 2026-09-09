class Solution {
    public long countCommas(long n) {
        long totalCommas = 0;
        

        for (long boundary = 1000; boundary <= n; boundary *= 1000) {
            totalCommas += (n - boundary + 1);

            if (boundary > Long.MAX_VALUE / 1000) {
                break;
            }
        }
        
        return totalCommas;
    }}
