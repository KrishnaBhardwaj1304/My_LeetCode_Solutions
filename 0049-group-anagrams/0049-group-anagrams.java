class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String , List<String>> map = new HashMap<>();
        ArrayList<ArrayList> ans = new ArrayList<>();
        
        for(int i = 0 ; i < strs.length; i++){
            char[] ca = strs[i].toCharArray();
            Arrays.sort(ca);
            String sS = new String (ca);
            if(!map.containsKey(sS)){
                map.put(sS,new ArrayList<>());
            }
                map.get(sS).add(strs[i]);  
        } 
        return new ArrayList<>(map.values());
    }
}