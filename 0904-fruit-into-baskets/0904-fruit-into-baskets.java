// import java.util.HashMap;
// import java.util.Map;

// class Solution {
//     public int totalFruit(int[] fruits) {
//         Map<Integer, Integer> counts = new HashMap<>();
//         int left = 0;
//         int longest = 0;

//         for (int right = 0; right < fruits.length; right++) {
//             counts.put(fruits[right], counts.getOrDefault(fruits[right], 0) + 1);

//             while (counts.size() > 2) {
//                 int leftFruit = fruits[left];
//                 counts.put(leftFruit, counts.get(leftFruit) - 1);

//                 if (counts.get(leftFruit) == 0) {
//                     counts.remove(leftFruit);
//                 }

//                 left++;
//             }

//             longest = Math.max(longest, right - left + 1);
//         }

//         return longest;
//     }
// }

class Solution{
    public int totalFruit(int []fruits){
        HashMap<Integer , Integer> map = new HashMap<>();
        int maxlen = 0;
        int left = 0;

        for(int right = 0 ; right < fruits.length; right++){
            // counts.put(fruits[right], counts.getOrDefault(fruits[right], 0) + 1);
            map.put(fruits[right] , map.getOrDefault(fruits[right] , 0)  + 1);
            while(map.size() > 2){
                map.put(fruits[left] , map.getOrDefault(fruits[left] , 0) - 1);
                if(map.get(fruits[left]) == 0){
                    map.remove(fruits[left]);
                }
left ++;

            }
            maxlen = Math.max(maxlen , right - left + 1);
        }
        return maxlen;
    }
}