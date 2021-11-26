class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        int count = 0;
        for(int row = 0; row < mat.length; row++){
            
            for(int col = 0; col < mat[row].length; col++){
                count++;
            }
        }
        
        int[] tmp = new int[count];
        int i = 0;
        for(int row = 0; row < mat.length; row++){
            
            for(int col = 0; col < mat[row].length; col++){
                tmp[i] = mat[row][col];
                i++;
            }
        }
        
        if(count != r*c){
            return mat;
        }
        else{
            
            int[][] answer = new int[r][c];
            int j = 0;
            for(int row = 0; row < answer.length; row++){
            
                for(int col = 0; col < answer[row].length; col++){
                    answer[row][col] = tmp[j];
                    j++;
                }
            }
            
            return answer;
        }
    }
}