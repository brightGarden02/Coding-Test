class Solution {
    public int[][] updateMatrix(int[][] mat) {
        
        int m = mat.length;
        int n = mat[0].length;
        int maxDis = m + n - 2;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) continue;
                else mat[i][j] = maxDis;
            }
        }
        for (int i = 0; i <  m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) continue;
                if (i-1 >= 0) mat[i][j] = Math.min(mat[i - 1][j] + 1, mat[i][j]);
                if (j-1 >= 0) mat[i][j] = Math.min(mat[i][j - 1] + 1, mat[i][j]); 
            }
        }
        
        for (int i = m-1; i >= 0; i--) {
            for (int j = n-1; j >= 0; j--) {
                if (mat[i][j] == 0) continue;
                if (i+1 < m) mat[i][j] = Math.min(mat[i + 1][j] + 1, mat[i][j]);
                if (j+1 < n) mat[i][j] = Math.min(mat[i][j + 1] + 1, mat[i][j]); 
            }
        }
        
        return mat;
    }
}