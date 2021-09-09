class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i < s.length(); i++){
            char tmp = s.charAt(i);
            
            if(Character.isLowerCase(tmp)){
                tmp = (char)((tmp - 'a' + n) % 26 + 'a');
            }
            else if(Character.isUpperCase(tmp)){
                tmp = (char)((tmp - 'A' + n) % 26 + 'A');
                
            }
            
            answer = answer + tmp;
            
        }
        
        return answer;
    }
}