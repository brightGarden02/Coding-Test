class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        
        for(int row = 0; row < matrix.length; row++){
            
            int left = 0;
            int right = matrix[row].length-1;
            int mid = 0;
            while(left <= right){
                
                mid = (left + right) / 2;
                if(matrix[row][mid] < target){
                    left = mid + 1;
                }    
                else if(matrix[row][mid] > target){
                    right = mid - 1;
                }
                else{
                    return true;
                }
            }
            
        }
        return false;
    }
}