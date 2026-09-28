class Solution {
    public int findKthPositive(int[] arr, int k) {
        int number = 1 ;
        int index = 0;
        while(true){
            if(index < arr.length && arr[index] == number){
                index++;
            }
            else{
                k--;
            }

            if(k == 0){
                return number;
            }
            number++;
        }
    }
}