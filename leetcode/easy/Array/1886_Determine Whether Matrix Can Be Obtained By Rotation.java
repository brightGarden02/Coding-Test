class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        
        if(Arrays.deepEquals(mat, target)) return true;
        
        int n = mat.length;
        
        int[][] arr1 = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr1[i][j] = mat[n-1-j][i];
            }
        }
        
        int[][] arr2 = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr2[i][j] = arr1[n-1-j][i];
            }
        }
        
        int[][] arr3 = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr3[i][j] = arr2[n-1-j][i];
            }
        }
        
        if(Arrays.deepEquals(target, arr1) || Arrays.deepEquals(target, arr2) || Arrays.deepEquals(target, arr3)) return true;
        
        return false;
    }
}