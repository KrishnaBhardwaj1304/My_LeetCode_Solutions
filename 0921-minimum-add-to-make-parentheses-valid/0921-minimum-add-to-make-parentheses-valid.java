class Solution {
    public int minAddToMakeValid(String s) {

        if(s.length() == 0)return 0;

        Stack<Character> st = new Stack <>();
        int count = 0;

        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '('){
                st.push(s.charAt(i));
            }
            else {
            if(st.isEmpty()){
                count++;
            }
            else {
                st.pop();
            }
            }
        }
        
        return count + st.size();
    }
}