class Solution {
    public void rotate(int[][] matrix) {
        
        for(int i = 0; i < matrix.length; i++){
            
            int l = 0;
            int r = matrix.length-1;
            while(l < r){
                int tmp = matrix[i][l];
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = tmp;
                l++; r--;
            }
        }
        
        int n = matrix.length-1;
        for(int r = 0; r < n; r++){
            
            for(int c = 0; c <= n-r-1; c++){
                int tmp = matrix[r][c];
                matrix[r][c] = matrix[n-c][n-r];
                matrix[n-c][n-r] = tmp;
                
            }
        }
        
    }
}