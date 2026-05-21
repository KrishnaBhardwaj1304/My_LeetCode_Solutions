class Solution {
    public int searchInsert(int[] nums, int target) {
        int r = nums.length - 1; 
        int l = 0;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(target < nums[mid]){
                r = mid-1;
            }
            else if(target > nums[mid]){
                l = mid+1;
            }
        }
        return l;
    }
}