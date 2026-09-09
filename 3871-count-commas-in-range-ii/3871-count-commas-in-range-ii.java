class Solution {
    public long countCommas(long n) {
        long totalCommas = 0;
        
        // Boundaries where commas are added: 10^3, 10^6, 10^9, 10^12, 10^15
        for (long boundary = 1000; boundary <= n; boundary *= 1000) {
            totalCommas += (n - boundary + 1);
            
            // Prevent potential overflow if boundary * 1000 exceeds Long.MAX_VALUE
            if (boundary > Long.MAX_VALUE / 1000) {
                break;
            }
        }
        
        return totalCommas;
    }}
