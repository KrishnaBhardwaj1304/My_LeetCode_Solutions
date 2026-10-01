class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        for(int i = 0 ; i < k ; i++){
            sum = sum + arr[i];
        }
        // int low = 0;
        // int high = k;
        // double avg = 0.0;
        int count = 0;
        // while(high-1 <= arr.length -1)
        for(int i = 0; i <= arr.length - k ;i++){
            // avg = sum / k;
            // if(avg >= threshold){
            //     count ++;
            if(sum >= threshold  * k){
                count ++;
            }
            
            // sum = sum - arr[low];
            // low++;
            // high++;
            // sum = sum + arr[high-1];
            if(i < arr.length - k){
                sum -= arr[i];
                sum += arr[i + k];
            }
        }
        return count;
    }
}