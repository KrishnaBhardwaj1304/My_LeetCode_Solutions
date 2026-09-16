class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        int ee = extraCandies;
        ArrayList<Boolean> ans = new ArrayList<>();
        for(int i = 0 ;i < candies.length ; i++){
            if(candies[i] + ee >=max){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }
}