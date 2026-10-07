// class Solution {
//     public long maximumSubarraySum(int[] nums, int k) {
//         HashSet <Integer > set = new HashSet<>();

//         int count = 0;
//         int sum = 0;
//         int max = 0;
//         int left = 0;

//         for(int right = 0; right < nums.length; right++){
            
//             if(set.contains(nums[right]) || count == k){
                
//                 set.remove(nums[left]);
//                 sum = sum - nums[left];
//                 left++;
//                 count--;
                
//             }
//             if(!set.contains(nums[right])){
//                 sum = sum + nums[right];
//                 set.add(nums[right]);
//             count++;
//             }
            
//             if(count == k)
// {
//                 max = Math.max(sum , max);
//             }
//         }
//         return max;
//     }
// }

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0;
        long max = 0;
        int left = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            if (right - left + 1 > k) {
                int out = nums[left++];
                sum -= out;

                int remaining = map.get(out) - 1;
                if (remaining == 0) {
                    map.remove(out);
                } else {
                    map.put(out, remaining);
                }
            }

            if (right - left + 1 == k && map.size() == k) {
                max = Math.max(sum, max);
            }
        }

        return max;
    }
}
