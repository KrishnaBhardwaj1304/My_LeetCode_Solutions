class Solution {
    public int[] sortedSquares(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ;i++ ){
            map.put(nums[i], nums[i]*nums[i]);
        }
        for(int i = 0; i < nums.length; i++){
            nums[i] = map.get(nums[i]);
        }
        Arrays.sort(nums);
        return nums;
    }
}