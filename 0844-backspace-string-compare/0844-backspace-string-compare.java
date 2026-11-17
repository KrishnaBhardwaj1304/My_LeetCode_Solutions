
class Solution {
    public boolean backspaceCompare(String s, String t) {

        Stack <Character> st = new Stack<>();
        Stack <Character> rt = new Stack<>();

        int len1 = s.length();
        int len2 = t.length();

        StringBuilder sb1 = new StringBuilder("");
        StringBuilder sb2 = new StringBuilder("");

        for(int i = 0 ; i < len1 ; i++){
            char ch = s.charAt(i);
           if(ch >= 'a' && ch <= 'z'){
            st.push(ch);
           }
           else if (st.size() != 0){
            st.pop();
           }
        }

        for(int i = 0 ; i < len2 ; i++){
            char ch = t.charAt(i);
           if(ch >= 'a' && ch <= 'z'){
            rt.push(ch);
           }
           else if (rt.size() != 0){
            rt.pop();
           }
        }

        while(!st.isEmpty()){
            sb1.append(st.pop());
        }
        while(!rt.isEmpty()){
            sb2.append(rt.pop());
        }
        return sb1.toString().equals(sb2.toString());
        }
    }