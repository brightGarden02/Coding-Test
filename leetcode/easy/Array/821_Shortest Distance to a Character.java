class Solution {
    public int[] shortestToChar(String s, char c) {
        
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c){
                count++;
            }
        } 
        int[] array = new int[count];
        
        int j = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c){
                array[j] = i;
                j++;
            }
        }
        
        
        int[] answer = new int[s.length()];
        int k = 0;
        for(int i = 0; i < s.length(); i++){
            
            if(s.charAt(i) != c){
                if(k > 0){
                    answer[i] = Math.min(Math.abs(array[k] - i), Math.abs(array[k-1] - i));
                }
                else{
                    answer[i] = Math.abs(array[k] - i);
                }
            }
            else if(s.charAt(i) == c){
                answer[i] = 0;
                if(k < array.length-1){
                    k++;   
                }
            }
        }
        
        return answer;
    }
}