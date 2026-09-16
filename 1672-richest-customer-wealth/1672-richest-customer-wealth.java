class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum = 0;
        int k = 0;
        HashMap<Integer , Integer> map = new HashMap<> ();
    for(int i = 0; i< accounts.length ;i++){
        sum = 0;
        for(int j = 0 ; j<accounts[i].length ; j++){
            sum = sum + accounts[i][j];
        }
        map.put(i,sum);
    }
        for(int i= 0 ;i < accounts.length;i++){
            if(map.get(i) > k){
                k = map.get(i);
            }
        }
        return k;
    }
}