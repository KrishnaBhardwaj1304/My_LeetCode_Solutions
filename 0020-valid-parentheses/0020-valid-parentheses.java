import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(st.isEmpty() && (s.charAt(i) == '}' || s.charAt(i) == ']' || s.charAt(i) == ')')){
                return false;
            }
            if(ch == '('){
                st.push('(');
            }
            if(ch == '{'){
                st.push('{');
            }
            if(ch == '['){
                st.push('[');
            }
            if(ch == ')'){
                if(st.isEmpty()) return false;
                if(st.peek() != '(') return false;
                st.pop();
            }
            if(ch == '}'){
                if(st.isEmpty()) return false;
                if(st.peek() != '{') {return false;}
                st.pop();
            }
            if(ch == ']'){
                if(st.isEmpty()) return false;
                if(st.peek() != '[') return false;
                st.pop();
            }
        }
        if(st.isEmpty()){
                return true;
            }
            else{
                return false;
            }
    }
}