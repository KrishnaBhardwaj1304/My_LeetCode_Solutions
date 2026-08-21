class Solution {
    public int[] constructRectangle(int area) {
        int n = area;
        int [] ans = new int[2];

        for(int i = 1 ; i <= Math.sqrt(area) ; i++){
            if(n%i == 0){
                int k = n/i;
                if(i<=k){
                    if(((ans[0] - ans[1]) > (k-i)) || (ans[0] == 0 && ans[1] == 0)){
                        ans[0] = k;
                        ans[1] = i;
                    }
                }
            }
        }
        return ans;
    }
}