class Solution {
    public String minWindow(String s, String t) {
        int windStart = 0;
        int windEnd = 0;
        int startIdx = -1;
        int length = Integer.MAX_VALUE;
        int matched = 0;
        HashMap <Character , Integer> map = new HashMap<>();

        for(int i = 0; i < t.length(); i++){
            char cc = t.charAt(i);
            map.put(cc , map.getOrDefault(cc , 0) + 1);
        }

        for(; windEnd < s.length(); windEnd++){
            char nc = s.charAt(windEnd);
            if(map.containsKey(nc)){
                map.put(nc , map.get(nc) - 1);
                if(map.get(nc) >= 0){
                    matched++;
                }
            }
            while(matched == t.length()){
                if(length > (windEnd - windStart + 1)){
                    length = windEnd - windStart + 1;
                    startIdx = windStart;

                }

                char startChar = s.charAt(windStart++);
                if(map.containsKey(startChar)){
                    if(map.get(startChar) == 0){
                        matched--;
                    }
                    map.put(startChar , map.get(startChar) + 1);
                }
            }



        }
        if(startIdx == -1){
            return "";
        }
        return s.substring(startIdx , startIdx + length);
    }
}