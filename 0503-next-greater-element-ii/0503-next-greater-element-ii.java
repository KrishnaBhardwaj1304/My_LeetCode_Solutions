class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack <Integer> st = new Stack<>();
        int [] result = new int[nums.length];

        for(int i = nums.length - 2 ;i >= 0; i--){
            while(!st.isEmpty() && st.peek() <= nums[i]){
                st.pop();
            }
            st.push(nums[i]);
        }
        for(int i = nums.length - 1 ;i >= 0; i--){
            while(!st.isEmpty() && st.peek() <= nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                result[i] = -1;
            }
            else{
                result[i] = st.peek();

            }
            st.push(nums[i]);
        }
        return result;
    }
}