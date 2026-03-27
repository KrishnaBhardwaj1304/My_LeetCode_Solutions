class Solution {
    public int findDuplicate(int[] nums) {
       Arrays.sort(nums);
        int a = 0;
        for(int i = 1; i < nums.length ;i++){
            if(nums[i]==nums[i-1]){
                a = nums[i];
                break;
            }
        }
        return a;  
    }
}