class Solution {
    public boolean isValid(int[] piles , int h , int capacity){
        long noOfHours = 0;
        for(int pile : piles){
            if(pile % capacity == 0){
                noOfHours += pile/capacity;
            }
            else{
                noOfHours += pile/capacity + 1;
            }
        }
        return noOfHours <= h;
    }
    public int minEatingSpeed(int []piles , int h) {
        int low = 1; 
        int high = 0;
        for(int pile : piles){
            high = Math.max(pile , high);
        }
        while(low <= high){
            int mid = low + (high - low)/2;
            if(isValid( piles , h , mid)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}