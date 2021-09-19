class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int answer = 0;
        
        for(String s : operations){
            if(s.contains("-")){
                answer--;
            }
            else{
                answer++;
            }
        }
        
        return answer;
    }
}