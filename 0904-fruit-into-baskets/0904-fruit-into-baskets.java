// class Solution {
//     public int totalFruit(int[] fruits) {
//         HashMap <Integer , Integer> map = new HashMap<>();
//         int left = 0;
//         int right = 0;
//         int curr = 0;
//         int max = 0;
//         while(right < fruits.length){
//             curr = right;
//             if(curr == map.contains(fruits[curr])){
//                 map.put(fruits[right] , 1);
//                 curr++;
//             }
//             else
            
            
//         } 
//     }
// }
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> counts = new HashMap<>();
        int left = 0;
        int longest = 0;

        for (int right = 0; right < fruits.length; right++) {
            counts.put(fruits[right], counts.getOrDefault(fruits[right], 0) + 1);

            while (counts.size() > 2) {
                int leftFruit = fruits[left];
                counts.put(leftFruit, counts.get(leftFruit) - 1);

                if (counts.get(leftFruit) == 0) {
                    counts.remove(leftFruit);
                }

                left++;
            }

            longest = Math.max(longest, right - left + 1);
        }

        return longest;
    }
}