class Solution {
    public String solution(int[] numbers, String hand) {
        
        StringBuilder sb = new StringBuilder();
        int leftNumber = 10;
        int rightNumber = 12;
        int leftLength = 0;
        int rightLength = 0;
        
        for(int i = 0; i < numbers.length; i++){
            
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7){
                sb.append("L");
                leftNumber = numbers[i];
            }
            else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9){
                sb.append("R");
                rightNumber = numbers[i];
            }
            else{
                leftLength = findLength(leftNumber, numbers[i]);
                rightLength = findLength(rightNumber, numbers[i]);
                int value = compare(leftLength, rightLength);
                
                if(value < 0){
                    sb.append("L");
                    leftNumber = numbers[i];
                }
                else if(value > 0){
                    sb.append("R");
                    rightNumber = numbers[i];
                }
                else{
                    if(hand.equals("left")){
                        sb.append("L");
                        leftNumber = numbers[i];
                    }else if(hand.equals("right")){
                        sb.append("R");
                        rightNumber = numbers[i];
                    }
                }
            }
        }
        
        return sb.toString();
    }
    
    public int findLength(int currentNumber, int targetNumber){
        
        currentNumber = (currentNumber == 0) ? 11 : currentNumber; 
        targetNumber = (targetNumber == 0) ? 11 : targetNumber; 
        
        int length = Math.abs(currentNumber - targetNumber);
        
        
        return length/3 + length%3;
    }
    
    public int compare(int a, int b){
        
        if(a > b){
            return 1;
        }
        else if(a < b){
            return -1;
        }
        else{
            return 0;
        }
    }
}