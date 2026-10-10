// class Solution {
//     public long countSubarrays(int[] nums, int minK, int maxK) {
        
//     }
// }

class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long answer = 0;

        int lastMin = -1;
        int lastMax = -1;
        int bad = -1;

        for (int right = 0; right < nums.length; right++) {
            int value = nums[right];

            if (value < minK || value > maxK) {
                bad = right;
            }

            if (value == minK) {
                lastMin = right;
            }

            if (value == maxK) {
                lastMax = right;
            }

            int earliestBound = Math.min(lastMin, lastMax);
            answer += Math.max(0, earliestBound - bad);
        }

        return answer;
    }
}