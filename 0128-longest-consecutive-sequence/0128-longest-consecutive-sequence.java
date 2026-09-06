// class Solution {
//     public int longestConsecutive(int[] nums) {
//         HashSet <Integer> set = new HashSet<>();
//         for(int i = 0 ; i < nums.length ; i++){
//             set.add(nums[i]);
//         }

//         for(int i = 0 ;i < nums.length ; i++){
//             int current = 0;
//             int max = 0;
//             if(set.contains(nums[i]+1)){
//                 int a = nums[i];
//                 while(set.contains(a)){

//                 }
//             }
//         }
//     }
// }
import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> hs = new HashSet<>();
        for(int i = 0 ; i < nums.length; i++){
            hs.add(nums[i]);
        }
        int max = 0;
        for(int i : hs){
            
            if(!hs.contains(i-1)){
                int currNum = i;
                int currStreak = 1;
                while(hs.contains(currNum+1)){
                    
                        currStreak ++;
                        currNum ++;
                    
                }
                max = Math.max(max,currStreak);
            }
        }
        return max;
    }
}