class Solution {
    private boolean isValid(int[] dist , double hour , int speed){
        double ns = 0;
        for(int d = 0 ; d <  dist.length -1  ; d++){
            
                ns += Math.ceil((double)dist[d]/(double)speed) ; 
        }

        ns += (double)dist[dist.length - 1]/(double)speed;

        return hour >= ns;
    }
    public int minSpeedOnTime(int[] dist, double hour) {
        int low = 1;
        int high = 10000000;
        int ans = -1 ;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(isValid(dist , hour , mid)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return (low == 10000001) ? -1 : low;
    }
}