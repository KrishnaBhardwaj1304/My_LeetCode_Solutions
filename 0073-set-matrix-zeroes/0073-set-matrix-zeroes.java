class Solution {
    public void setZeroes(int[][] matrix) {
        // int m = matrix.length;
        // int n = matrix[0].length;
        // boolean frz = false;
        // boolean fcz = false;
        // for(int i = 0 ; i < m ; i++){
        //     if(matrix[i][0] == 0){
        //         fcz = true;
        //         break;
        //     }
        // }
        // for(int j = 0 ; j < n; j++){
        //     if(matrix[0][j] == 0){
        //         frz = true;
        //         break;
        //     }
        // }
        // for(int i = 1 ;i < m ;i++){
        //     for(int j = 1 ;j < n ;j++){
        //         if(matrix[i][j] == 0){
        //             matrix[i][0] = 0;
        //             matrix[0][j] = 0;
        //         }
        //     }
        // }
        // for(int i = 1 ; i < m ; i++){
        //     for(int j = 1 ; j< n ; j++){
        //         if(matrix[i][0] == 0 || matrix[0][j] == 0){
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }
        // if(frz){
        //     for(int i = 0 ;i < n ; i++){
        //         matrix[i][0] = 0;
        //     }
        // }
        // if(fcz){
        //     for(int j = 0 ; j < m ;j++){
        //         matrix[0][j] = 0;
        //     }
        // }
        int m = matrix.length;
        int n = matrix[0].length;

        boolean frz = false;
        boolean fcz = false;

        // Check first column
        for(int i = 0 ; i < m ; i++){
            if(matrix[i][0] == 0){
                fcz = true;
                break;
            }
        }

        // Check first row
        for(int j = 0 ; j < n; j++){
            if(matrix[0][j] == 0){
                frz = true;
                break;
            }
        }

        // Mark rows and columns
        for(int i = 1 ; i < m ; i++){
            for(int j = 1 ; j < n ; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Set zeroes based on markers
        for(int i = 1 ; i < m ; i++){
            for(int j = 1 ; j < n ; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        // Fix first row
        if(frz){
            for(int j = 0 ; j < n ; j++){
                matrix[0][j] = 0;
            }
        }

        // Fix first column
        if(fcz){
            for(int i = 0 ; i < m ; i++){
                matrix[i][0] = 0;
            }
        }
    }
}