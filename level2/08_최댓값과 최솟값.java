import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strArray = s.split(" ");
        
        int[] intArray = new int[strArray.length];
        
        for(int i = 0; i < strArray.length; i++){
            if(strArray[i].contains("-1")){
                strArray[i] = strArray[i].replace("-", "");
                int number = Integer.parseInt(strArray[i]);
                intArray[i] = -number;
            }
            else{
                intArray[i] = Integer.parseInt(strArray[i]);
            }
        }
        
        Arrays.sort(intArray);
        answer = Integer.toString(intArray[0]) + " " + Integer.toString(intArray[intArray.length-1]);
        
        return answer;
    }
}