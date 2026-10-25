class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int max = 0;

        for(int i = 0 ; i < nums.size() ; i++){
            max = Math.max(max , nums.get(i).get(1));
        }
        int [] arr = new int[max + 1];
        for(int i = 0 ; i < nums.size() ;i++){
            for(int j = nums.get(i).get(0) ; j <= nums.get(i).get(1) ; j++){
                arr[j] = 1;
            }
        }
        int length = 0;
        for(int k = 0 ; k < arr.length ; k ++){
            length += arr[k];
        }
        return length;
    }
}