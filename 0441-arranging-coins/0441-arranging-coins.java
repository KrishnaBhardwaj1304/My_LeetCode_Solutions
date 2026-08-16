// class Solution {
//     public int arrangeCoins(int n) {
//         if(n == 0){
//             return 0;
//         }
//         int i = 0 ; 
//         int k = 0 ;
//         int ans = 0;
//         while((k*(k+1)/2)<=n){
//             i++;
//             k=k+i;
//             n=n-i;
//             ans++;
//         }
//         return ans;
//     }
// }

class Solution {
    public int arrangeCoins(int n) {
        long left = 1;
        long right = n;
        long res = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            // Total coins needed for 'mid' rows: k * (k + 1) / 2
            long coinsNeeded = mid * (mid + 1) / 2;

            if (coinsNeeded == n) {
                return (int) mid;
            } else if (coinsNeeded < n) {
                res = mid;
                left = mid + 1; // Try to build more rows
            } else {
                right = mid - 1; // Too many coins needed, shrink range
            }
        }

        return (int) res;
    }
}