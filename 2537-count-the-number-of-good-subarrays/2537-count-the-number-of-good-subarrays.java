// class Solution {
//     public long countGood(int[] nums, int k) {
//         int left = 0;
//         int count = 0;
//         long answer = 0;
        
//         HashMap<Integer , Integer> map = new HashMap<>();

//         for(int right = 0; right < nums.length; right ++){
//             map.put(nums[right] , map.getOrDefault(nums[right] , 0) + 1);
        

//         while(left <= right && countPairs(map) >= k){
//             answer = answer + (nums.length - right);
//             int value = nums[left++];
//             count = map.get(value) - 1;

//             if(count == 0){
//                 map.remove(value);
//             }
//             else{
//                 map.put(value , count);
//             }
//         }
//     }
//     return answer;
// }

//     private long countPairs(HashMap<Integer , Integer> map){
//         long count = 0;
//         for(int pair :  map.values()){
//             count = count + (long) pair * (pair-1) / 2; 
//         }
//         return count ;
//     }    
// }




import java.util.HashMap;

// class Solution {
//     public long countGood(int[] nums, int k) {
//         int left = 0;
//         long pairs = 0;
//         long answer = 0;
//         HashMap<Integer, Integer> map = new HashMap<>();

//         for (int right = 0; right < nums.length; right++) {
//             int value = nums[right];
//             int frequency = map.getOrDefault(value, 0);

            
//             pairs += frequency;
//             map.put(value, frequency + 1);

//             while (pairs >= k) {
                // answer += nums.length - right;

                // int removed = nums[left++];
                // int newFrequency = map.get(removed) - 1;
                // pairs -= newFrequency;

//                 if (newFrequency == 0) {
//                     map.remove(removed);
//                 } else {
//                     map.put(removed, newFrequency);
//                 }
//             }
//         }

//         return answer;
//     }
// }


class Solution{
    public long countGood(int[] nums , int k){
        int left = 0;
        int pairs = 0;
        long ans = 0;
        HashMap <Integer , Integer> map = new HashMap<>();

        for(int right = 0 ;right < nums.length; right++){
            int value = nums[right];
            int freq = map.getOrDefault(value , 0);
            pairs = pairs + freq;
            map.put(value , freq + 1);

            while(pairs >= k){
                ans = nums.length - right + ans;

                int removed = nums[left++];
                int newFreq = map.get(removed) - 1;
                pairs -= newFreq;

                if(newFreq == 0){
                    map.remove(removed);
                }
                else{
                    map.put(removed , newFreq);
                }
            }
        }
        return ans;

    }
}