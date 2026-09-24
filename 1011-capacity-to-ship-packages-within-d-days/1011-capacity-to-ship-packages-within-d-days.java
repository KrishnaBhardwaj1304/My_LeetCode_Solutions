class Solution {
    public boolean isValid(int [] weights , int days , int mid){
        int d = 1 ;
        int currEle = 0;
        for(int weight : weights){

            currEle = currEle + weight;

            if(currEle > mid){
                currEle = weight;
                d++;
            }
        }
        return d <= days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        int ans = 0;
        for(int weight : weights){
            low = Math.max(low,weight);
            high = high + weight;
        }
        while(low < high){
            int mid = low + (high - low)/2;
            
            if(isValid(weights , days , mid)){
                ans = mid;
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}