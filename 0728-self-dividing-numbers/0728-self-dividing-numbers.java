class Solution {
    public boolean isDivisible(int n){
        int k = n;
        int d = 0;
        while(k>0){
            if(n > 0 && n < 10){
                return true;
            }
            if(k % 10 == 0){
                return false;
            }
            d = k % 10;
            if(n % d != 0){
                return false;
            }
            k = k / 10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List <Integer> ans = new ArrayList<>();
        for(int i = left ; i < right + 1 ; i++){
            if(isDivisible(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}