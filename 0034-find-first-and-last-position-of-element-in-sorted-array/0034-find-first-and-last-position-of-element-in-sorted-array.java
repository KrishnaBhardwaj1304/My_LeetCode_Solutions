class Solution {

    public int leftElement(int[] nums , int target){
        int low = 0 ;
        int high = nums.length - 1;
        int ans1 = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target){
                ans1 = mid;
                high = mid - 1;
                }
            else if(nums[mid] < target){
                low = mid + 1;
           }
           else{
            high = mid - 1;
           }
        }
        return ans1;
    }

    public int rightElement(int[] nums , int target){
        int low = 0 ;
        int high = nums.length - 1;
        int ans2 = -1;
        while(low <= high){
            int mid = low + (high - low)/ 2;
            if(nums[mid] == target){
                ans2 = mid;
                low = mid + 1;
            }
            else if(nums[mid] < target){
                low  = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans2;
    }
    public int[] searchRange(int[] nums, int target) {
        int [] ans = new int[2];
        ans[0] = leftElement(nums , target);
        ans[1] = rightElement(nums , target);
        return ans;
    }
}