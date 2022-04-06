class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int correct = 0;
        int zeroCounts = 0;
        int firstTmpRank = 0;
        int firstRank = 0;
        for(int i = 0; i < lottos.length; i++){
            for(int j = 0; j < win_nums.length; j++){
                if(lottos[i] == win_nums[j]){
                    correct++;
                    break;
                }
            }
        }
        
        for(int i = 0; i < lottos.length; i++)
            if(lottos[i] == 0) zeroCounts++;
        
        if(correct == 6){
            answer[0] = 1;
            answer[1] = 1;
        }    
        else if(correct == 0){
            
            if(zeroCounts == 6){
                answer[0] = 1;
                answer[1] = 6;
            }
            else{
                answer[0] = 6;
                answer[1] = 6;
            }
        }
        else{
            answer = findRank(correct, firstTmpRank, firstRank, zeroCounts, answer);
        }
        
        return answer;
    }
    
    public int[] findRank(int correct, int firstTmpRank, int firstRank, int zeroCounts, int[] answer){
        if(correct == 5) firstTmpRank = 2;
        else if(correct == 4) firstTmpRank = 3;
        else if(correct == 3) firstTmpRank = 4;
        else if(correct == 2) firstTmpRank = 5;
        else firstTmpRank = 6;
            
        firstRank = firstTmpRank - zeroCounts;
            
        answer[0] = firstRank;
        answer[1] = firstTmpRank;
        
        return answer;
    } 
}
