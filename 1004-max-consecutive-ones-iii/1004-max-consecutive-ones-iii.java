class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int ans = 0;
        int zc = 0;
        while(right < nums.length){
            if(nums[right] == 0){
                zc++;
            }
            right++;
            if(zc > k){
                if(nums[left] == 0){
                    zc--;
                }
                    left++;
            }
            ans = Math.max(ans , right - left);
        }
        return ans;
    }
}