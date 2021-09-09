class Solution {
    public String solution(String s) {
        String answer = "";
        int number = 0;
        char ch = ' ';
        for(int i = 0; i < s.length(); i++){
            
            if(s.charAt(i) == ' '){
                number = 0;
                ch = ' ';
            }
            else if(number%2 == 1){
                ch = s.charAt(i);
                ch = Character.toLowerCase(ch);
                number++;
            }
            else{
                ch = s.charAt(i);
                ch = Character.toUpperCase(ch);
                number++;
            }
            answer += ch;
        }
        
        return answer;
    }
}