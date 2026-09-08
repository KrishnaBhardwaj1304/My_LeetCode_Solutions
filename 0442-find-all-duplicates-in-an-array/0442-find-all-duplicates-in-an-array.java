import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            // First time seeing the number? Put it in the map
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } 
            // Second time seeing the number? Add directly to ans!
            else {
                ans.add(nums[i]);
            }
        }

        return ans;
    }
}