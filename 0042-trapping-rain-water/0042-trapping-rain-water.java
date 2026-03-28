class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int [] lar = new int[height.length];
        lar[0] = height[0];
        for(int i = 1;i < n ; i++){
            lar[i] = Math.max(lar[i-1] , height[i]);
        }
        int [] rar = new int [height.length];
        rar[n-1] = height[n-1];
        for(int j = n-2 ; j >= 0 ;j--){
            rar[j] = Math.max(rar[j+1] , height[j]);
        }
        int ans = 0;
        for(int i = 0 ;i < n ;i++){
            ans = ans + (Math.min(lar[i] , rar[i]) - height[i]);
        }
        return ans;
    }
}