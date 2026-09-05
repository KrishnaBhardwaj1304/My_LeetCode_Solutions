class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap <Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < numbers.length; i++){
            // map.put(numbers[i], i);
            if (!map.containsKey(numbers[i])) {
    map.put(numbers[i], i);
}
        }
        int [] arr = new int[2];
        for(int i = 0 ;i < numbers.length; i++){
            int complement = target - numbers[i];
            if(map.containsKey(complement)  && map.get(complement) < i){
                arr[0] = map.get(complement) +1;
                arr[1] = i+1;
                break;
            }
        }
        return arr;
    }
}