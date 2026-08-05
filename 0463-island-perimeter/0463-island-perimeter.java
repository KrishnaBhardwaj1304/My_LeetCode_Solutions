// class Solution {
//     public int islandPerimeter(int[][] grid) {
//         int count = 0;
//         for(int row = 0 ; row < grid.size() ; row++){
//             for(int col = 0 ; col < grid[0].size(); col++){
//                 if(grid[i][j] == 1){
//                     //up
//                     if(i > 0 && grid[i-1][j] == 0 || i == 0){

//                     }
//                 }
//             }
//         }
//     }
// }



class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 1) {
                    perimeter += 4;

                    // Shared edges do not contribute to the perimeter.
                    if (r > 0 && grid[r - 1][c] == 1) perimeter -= 2;
                    if (c > 0 && grid[r][c - 1] == 1) perimeter -= 2;
                }
            }
        }

        return perimeter;
    }
}