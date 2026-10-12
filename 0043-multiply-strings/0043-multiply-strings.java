// class Solution {
//     public String multiply(String num1, String num2) {
//         int numa = 0;
//         int mul1 = 0;

//         for(int i = 0; i < nums.length; i++){

//             int val = num1.charAt(i) - '0';
//             numa = numa + (mul1 * 10);
//             if(mul1 == 0){
//                 mul1 = 1;
//             }
//             mul1 = mul1*10;
            
//         }
//     }
// }

class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int n = num1.length();
        int m = num2.length();
        int[] result = new int[n + m];

        // Multiply each pair of digits.
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                int digit1 = num1.charAt(i) - '0';
                int digit2 = num2.charAt(j) - '0';
                int product = digit1 * digit2;

                int sum = product + result[i + j + 1];
                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }

        StringBuilder answer = new StringBuilder();

        for (int digit : result) {
            if (answer.length() == 0 && digit == 0) {
                continue; // Skip leading zeroes.
            }
            answer.append(digit);
        }

        return answer.toString();
    }
}