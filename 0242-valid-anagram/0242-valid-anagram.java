import java.util.*;


class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap <Character , Integer> map1 = new HashMap<>();
        HashMap <Character, Integer> map2 = new HashMap<>();
        if(s.length() != t.length()) return false;

        for(int i = 0 ; i < s.length(); i++){
            if(!map1.containsKey(s.charAt(i))){
                map1.put(s.charAt(i), 1);
            }
            else{
                int count1 = map1.get(s.charAt(i));
                map1.put(s.charAt(i) , count1+1);
            }
        }

        for(int j = 0 ; j < t.length() ; j++){
            if(!map2.containsKey(t.charAt(j))){
                map2.put(t.charAt(j) , 1);
            }
            else{
                int count2 = map2.get(t.charAt(j));
                map2.put(t.charAt(j), count2 + 1);
            }
        }
        // for(int i = 0 ; i < s.length() ; i++){
        //     if(map1.get(s.charAt(i)) != map2.get(t.charAt(i))) return false;
        // }
         return map1.equals(map2);
    }
}