// class Solution {
//     public boolean isPalindrome(String s) {
//         StringBuilder sb = new StringBuilder();
//         for(int i = 0 ; i < s.length() ;i++){
//             String lowerString = Character.toString(s.charAt(i)).toLowerCase();
//             if(Character.isAlphabetic(s.charAt(i))){
//                 sb.append(lowerString);
//             }
//         }
//         int low = 0;
//         int high = sb.length()-1;
//         while(low < high){
//             if((sb.charAt(low) != sb.charAt(high)) && (Character.isAlphabetic(sb.charAt(low)) && Character.isAlphabetic(sb.charAt(high)))){
//                 return false;
//             }
//             else{
//                 low = low + 1;
//                 high = high - 1;
//             }
//         }
//         return true;
//     }
// }
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s.length() ;i++){
            String lowerString = Character.toString(s.charAt(i)).toLowerCase();
            // CHANGE 1: isAlphabetic → isLetterOrDigit to include digits like '0','1' etc
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(lowerString);
            }
        }
        int low = 0;
        int high = sb.length()-1;
        while(low < high){
            // CHANGE 2: removed the isLetterOrDigit conditions because
            // sb already has only alphanumeric characters from above loop
            // so just directly compare
            if(sb.charAt(low) != sb.charAt(high)){
                return false;
            }
            else{
                low = low + 1;
                high = high - 1;
            }
        }
        return true;
    }
}