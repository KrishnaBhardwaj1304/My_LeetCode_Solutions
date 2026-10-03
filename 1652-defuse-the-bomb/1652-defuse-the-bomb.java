class Solution{
    public int [] decrypt(int[] code , int k){
        int n = code.length;
        int [] ans = new int[n];
        




        for(int i = 0 ;i < n; i++){
            int sum = 0;
            if(k > 0){
                for(int steps = 1; steps <= k ;steps++){
                    sum = sum + code[(steps + i)%n];
                }
            }
            else{
                for(int steps = 1 ; steps <= -k ; steps++){
                    sum = sum + code[(i - steps + n)% n];
                }
            }
            ans[i] = sum;
        }
        return ans;
    }
}