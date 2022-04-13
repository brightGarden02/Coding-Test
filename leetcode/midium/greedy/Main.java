class Solution {
    public int[][] generateMatrix(int n) {
        
        int[][] arr = new int[n][n];
        
        int rowStart = 0;
        int rowEnd = n-1;
        
        int colStart = 0;
        int colEnd = n-1;
        int num = 1;
        
        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int i = colStart; i <= colEnd; i++) {
                arr[rowStart][i] = num++;
            }
            rowStart++;
            
            for (int i = rowStart; i <= rowEnd; i++) {
                arr[i][colEnd] = num++; 
            }
            colEnd--;
            
            for (int i = colEnd; i >= colStart; i--) {
                if (rowStart <= rowEnd)
                    arr[rowEnd][i] = num++; 
            }
            rowEnd--;
            
            for (int i = rowEnd; i >= rowStart; i--) {
                if (colStart <= colEnd)
                    arr[i][colStart] = num++; 
            }
            colStart++;
        }
        
        return arr;
    }
}
