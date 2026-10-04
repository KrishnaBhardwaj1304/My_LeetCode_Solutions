class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int left = 0;
        int right = 0;
        int ans = 0;
        while(right < s.length()){
            int n = Math.abs(s.charAt(right) - t.charAt(right));
            if(n <= maxCost){
                right++;
                maxCost = maxCost - n;
            }
            else{
                if(left == right && n > maxCost){
                    left++;
                    right++;
                }
                else{
                    int k = Math.abs(s.charAt(left) - t.charAt(left));
                    maxCost = maxCost + k;
                    left++;
                }
            }
            ans = Math.max(ans , (right - left));
        }
        return ans;
    }
}