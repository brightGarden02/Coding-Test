class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int area = brown + yellow;
        
        for(int col = 3; col <= area; col++){
            int row = area/col;
            
            if(row < col){
                continue;
            }
            if((row-2)*(col-2) == yellow){
                answer[0] = row;
                answer[1] = col;
                break;
            }
        }
        
        return answer;
    }
}
