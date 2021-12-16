class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        
        int num1 = toInt(firstWord) + toInt(secondWord);
        int num2 = toInt(targetWord);
        
        return num1 == num2;
    }
    
    public int toInt(String str){
        
        int num = 0;
        int j = 0;
        for(int i = str.length()-1; i >= 0; i--){
            
            num += (str.charAt(i) - 'a') * (int)Math.pow(10, j);
            j++;
        }
        
        return num;
    }
}