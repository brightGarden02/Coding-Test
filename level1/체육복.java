class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        int[] array = new int[n+1];
        
        for(int i = 1; i < array.length; i++){
            array[i]++;    
        }
        
        for(int i = 0; i < lost.length; i++){
            array[lost[i]]--;    
        }
        
        for(int i = 0; i < reserve.length; i++){
            array[reserve[i]]++;
        }
        
        for(int i = 1; i < array.length-1; i++){
            if(array[i] == 0){
                if(array[i+1] > 1){
                    array[i+1]--;
                    array[i]++;
                }
            }
            else if(array[i+1] == 0){
                if(array[i] > 1){
                    array[i]--;
                    array[i+1]++;
                }
                
            }
        }
        
        for(int i = 1; i < array.length; i++){
            if(array[i] != 0)
                answer++;
        }
        
        return answer;
    }
}