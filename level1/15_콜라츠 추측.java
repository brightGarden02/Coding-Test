class Solution {
    public int solution(int num) {
        int answer = 0;
        long number = num;
        
        while(answer < 500 && number != 1){
            if(number%2 == 0){
                number = number/2;
            }
            else{
                number = number*3 + 1;
            } 
            answer++;
        }
        
        if(answer == 500)
            return -1;
        else
            return answer;
    }
}