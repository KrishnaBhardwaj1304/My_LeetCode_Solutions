class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack <Integer> st = new Stack<>();
        HashSet<Integer> sh = new HashSet<>();

        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '('){
                st.push(i);
            }
            else if(s.charAt(i) == ')'){
                if(st.isEmpty()){
                    sh.add(i);
                }
                else{
                    st.pop();
                }
            }
        }

        while(!st.isEmpty()){
            sh.add(st.pop());
        }
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ;i < s.length(); i++){
            if(!sh.contains(i)){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
        
    }
}