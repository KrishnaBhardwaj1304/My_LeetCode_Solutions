class Solution {
    public int maxVowels(String s, int k) {

      //📌📌📌📌 this is also a good aproach but out off 107 only 103 test case and due to t.l.e. it got stuck....

    //   int n = sc.nextInt();
        // String v = "aeiou";
        // int i = 0;
        // int j = 0;
        // int count = 0;
        // int max = 0;
        // while(i <= s.length()-k){
        //     for(int l = i ;l < i + k ; l++){
        //         char ch = s.charAt(l);
        //         if(v.indexOf(ch) != -1){
        //             count++;
        //         }
        //     }
        //     if(count > max){
        //         max = count;
        //     }
        //     count = 0;
        //     i++;
        //     //j = i + n - 1;
        // }
        // return max;




        int count = 0;
        int max = 0;
        String v = "aeiou";
        for(int i  =  0; i < k ;i++){
            if(v.indexOf(s.charAt(i)) != -1){
            count++;
        }
    }
    max = count;
    for(int i = k ;i < s.length() ;i++){
        if(v.indexOf(s.charAt(i)) != -1){
            count++;
        }
        if(v.indexOf(s.charAt(i - k)) != -1){
            count--;
        }
        max = Math.max(max,count);
    } 
    return max;
}
}