class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i = 0 ;i <= k -1;i++){
            sum = sum + nums[i];
        }
        double avg = 0;
        
        double maxavg = (double) sum / k;
        int low = 0;
        int high = k - 1;
        while(high < nums.length - 1){
            
            sum = sum - nums[low] ;
            low++;
            high++;
            sum = sum + nums[high];

            avg = (double) sum / k;
            maxavg = Math.max(maxavg, avg);

        }
        return maxavg;
    }
}