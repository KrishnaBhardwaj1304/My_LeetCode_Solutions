class Solution {
    public int divisorSubstrings(int num, int k) {
        String str = String.valueOf(num);
        int low = 0;
        int high = k - 1;
        int count = 0;

        while(high < str.length()){
            String sub = str.substring(low , high + 1);
            int val = Integer.parseInt(sub);
            if(val != 0 && num % val == 0){
                count++;
            }
            low++;
            high++;
        }
        return count;
    }
}