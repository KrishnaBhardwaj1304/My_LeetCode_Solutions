// class Solution {
//     public boolean isCovered(int[][] ranges, int left, int right) {
        
//     //     for(int i = 0 ; i < ranges.length ; i++){
//     //         boolean marker = true;
//     //         for(int j = 0; j < 2 ; j++){
//     //             if(!(ranges[i][j] >= left && ranges[i][j] <= right)){
//     //                 marker = false ;
//     //             }
//     //             else{
//     //                 marker = true ;
//     //                 break;
//     //             }
//     //         }
//     //         if(marker == false){
//     //             return false;
//     //         }
//     //     }
//     //     return true;
//     // 
    
//     boolean marker = false;

//     for(int i = left ; i < right ; i++){
        
//         for(int[] range : ranges){
//             if(range[0] >= i && range[1] >= i){
//                 marker = true;
//                 break;
//             }

//         }
//         if(marker == false){
//             return false;
//         }
//     }
//     if(marker == true){
//         return true;
//     }
//     else{
//         return false;
//     }
    
//     }

// }

class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        for (int number = left; number <= right; number++) {
            boolean covered = false;

            for (int[] range : ranges) {
                if (range[0] <= number && number <= range[1]) {
                    covered = true;
                    break;
                }
            }

            if (!covered) {
                return false;
            }
        }

        return true;
    }
}