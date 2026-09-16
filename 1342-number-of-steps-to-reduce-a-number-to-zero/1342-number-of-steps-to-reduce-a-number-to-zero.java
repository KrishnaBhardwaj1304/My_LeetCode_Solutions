class Solution {
    public int numberOfSteps(int num) {
        int k = num;
        int count = 0;
        while(k > 0){
            if(k%2==0){
                k = k/2;
                count = count + 1;
            }
            else{
                k = k-1;
                count = count + 1;
            }
        }
        return count;
    }
}