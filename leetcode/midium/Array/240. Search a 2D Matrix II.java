class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row = matrix.length-1;
        int col = 0;
        
        while(row >= 0 && col < matrix[0].length){
            
            int tmp = matrix[row][col];
            
            if(tmp < target){
                col++;
            }
            else if(tmp > target){
                row--;
            }
            else{
                return true;
            }
            
        }
        
        return false;
        
    }
}