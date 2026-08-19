// class Solution {
//     public int nextsee (int []nums , int i){
//         int j = i+1;
//         for(int q = j ; q < nums.length ; q++){
//             if(nums[i] == nums[q]){
//                 return q;
//             }
//         }
//         return -1;
//     }
//     public boolean containsNearbyDuplicate(int[] nums, int k) {
//         for(int i = 0; i < nums.length ; i++){
//             int ns = nextsee(nums , i);
//             if(ns == -1){
//                 continue;
//             }
//             if(Math.abs(i - ns) <= k){
//                 return true;
//             }
//         }
//         return false;
//     }
// }

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> lastIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (lastIndex.containsKey(nums[i])) {
                int previousIndex = lastIndex.get(nums[i]);

                if (i - previousIndex <= k) {
                    return true;
                }
            }

            lastIndex.put(nums[i], i);
        }

        return false;
    }
}