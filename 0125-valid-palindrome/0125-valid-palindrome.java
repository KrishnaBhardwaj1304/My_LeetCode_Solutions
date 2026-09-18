class Solution {
    public boolean isPalindrome(String ss) {
        int start = 0;
        int end = ss.length()-1;
        String s = ss.toLowerCase();
        while(start < end){
            if(!(Character.isLetterOrDigit(s.charAt(start)))){
                start++;
                continue;
            }
            if(!(Character.isLetterOrDigit(s.charAt(end)))){
                end--;
                continue;
            }
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}