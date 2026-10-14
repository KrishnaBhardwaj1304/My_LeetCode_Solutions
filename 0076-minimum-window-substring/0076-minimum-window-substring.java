class Solution {
    public String minWindow(String s, String t) {
        int windStart = 0;
        int windEnd = 0;
        int startIdx = -1;
        int length = Integer.MAX_VALUE;
        int matched = 0;
        HashMap<Character, Integer> tmap = new HashMap<>();

        for(int i = 0;i < t.length() ; i++){
            tmap.put(t.charAt(i) , tmap.getOrDefault(t.charAt(i) , 0) + 1);
        }

        for(; windEnd < s.length() ; windEnd++){
            char currChar = s.charAt(windEnd);
            if(tmap.containsKey(currChar)){
                tmap.put(currChar , tmap.get(currChar) - 1);
                if(tmap.get(currChar) >= 0){
                    matched += 1;
                }
            }

            while(matched == t.length()){
                if(length > (windEnd - windStart + 1)){
                    length = (windEnd - windStart + 1);
                    startIdx = windStart;
                }

                char startChar = s.charAt(windStart++);
                if(tmap.containsKey(startChar)){
                    if(tmap.get(startChar) == 0){
                        matched -= 1;
                    }
                    tmap.put(startChar , tmap.get(startChar )+ 1);
                }
            }
        }
        if(startIdx == -1){
            return "";
        }
        return s.substring(startIdx , startIdx + length);


    }
}