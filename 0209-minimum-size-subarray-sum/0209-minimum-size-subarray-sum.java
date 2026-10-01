class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start= 0;
        int winsum = 0;
        int minlength = Integer.MAX_VALUE;
        for(int end = 0 ; end < nums.length ;end++){
            winsum = winsum + nums[end];
            while(winsum >= target){
                minlength = Math.min(minlength , end - start + 1);
                winsum-= nums[start];
                start += 1;
            }
        }
        if(minlength == 2147483647){
            return 0;
        }
        else{
            return minlength;
        }
    }
}