import java.lang.Math;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] array = new int[3];
        int index = 0;
        int value = 0;
        int digitCounts = 0;
        
        for(int i = 0; i < dartResult.length(); i++){
            char ch = dartResult.charAt(i);
            
            if(Character.isDigit(ch)){
                if(ch == '1' && dartResult.charAt(i+1) == '0'){
                    value = 10;    
                    i++;
                }
                else
                    value = Character.getNumericValue(ch);
                digitCounts++;
            }        
            else{
                if(ch == 'S'){
                    array[index++] = (int)Math.pow(value, 1);
                }
                else if(ch == 'D'){

                    array[index++] = (int)Math.pow(value, 2);
                }
                else if(ch == 'T'){

                    array[index++] = (int)Math.pow(value, 3);
                }
                else if(ch == '*'){
                    if(index - 2 < 0){
                        index = 0;
                    }
                    else{
                        index = index - 2;
                    }
                    while(index < digitCounts){
                        array[index] = array[index]*2;
                        index++;
                    }
                }
                else if(ch == '#'){
                    array[index-1] = array[index-1]*(-1); 
                }
            }
            
        }
        
        for(int i : array){
            answer += i; 
        }
            
        return answer;
    }
}
