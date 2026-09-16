class Solution {
    public List<String> fizzBuzz(int n) {
        List <String> Str = new ArrayList<>();
        for(int i = 1 ; i <= n ; i++ ){
            if(i % 15 == 0){
                Str.add("FizzBuzz");
            }

            else if(i % 3 == 0){
                Str.add("Fizz"); 
            }
            else if(i % 5 == 0){
                Str.add("Buzz");
            }
            else{
                Str.add(Integer.toString(i)) ;
            }
        }
        return Str;
    }
}