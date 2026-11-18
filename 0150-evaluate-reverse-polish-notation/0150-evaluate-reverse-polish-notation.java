class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> st = new Stack<>();

        for(int i = 0 ; i < tokens.length ; i++){
            if(!tokens[i].equals("+") &&
             !tokens[i].equals("-") &&
             !tokens[i].equals("*") &&
             !tokens[i].equals("/")){

             st.push(Integer.parseInt(tokens[i]));

            }
            else{
                int right = st.pop();
                int left = st.pop();

                if(tokens[i].equals("+")){
                    int c = left + right;
                    st.push(c);
                }
                else if(tokens[i].equals("-")){
                    int c = left - right;
                    st.push(c);
                }
                else if(tokens[i].equals("*")){
                    int c = left * right;
                    st.push(c);
                }
                else if(tokens[i].equals("/")){
                    int c = left / right;
                    st.push(c);
                }
            }
        }
        return st.pop();
    }
}