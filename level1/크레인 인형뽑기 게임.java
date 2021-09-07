import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int col = 0;
        int pick = 0;
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < moves.length; i++){
            col = moves[i];
            col--;
            for(int row = 0; row < board.length; row++){
                pick = board[row][col];
                if(pick != 0){
                    board[row][col] = 0;
                    break;
                }
            }
            if(!stack.empty()){
                if(stack.peek() == pick){
                    answer++;
                    // System.out.println("Same pick: " + pick);
                    // System.out.println("Answer: " + answer);
                    stack.pop();
                }
                else{
                    if(pick != 0){
                        stack.push(pick);
                        // System.out.println("push pick: " + pick);
                    }
                }
            }
            else{
                if(pick != 0){
                    stack.push(pick);
                    // System.out.println("push pick: " + pick);
                }
            }
        }
    
        return answer*2;
    }
}