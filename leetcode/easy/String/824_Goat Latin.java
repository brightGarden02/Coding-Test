class Solution {
    public String toGoatLatin(String sentence) {
        
        String[] array = sentence.split(" ");
        
        String ans = "";
        int i = 1;
        for(String s : array){
            
            int len = s.length();
            char c = s.charAt(0);
            String tmp = "";
            
            if((c == 'a' || c == 'A') || (c == 'e' || c == 'E') || (c == 'i' || c == 'I') || (c == 'o' || c == 'O') || (c == 'u' || c == 'U')){                    
                s += "ma";
                ans += s;
            }
            else {
                    
                tmp = s.substring(1, len);
                tmp += s.substring(0, 1);
                tmp += "ma";
                ans += tmp;
            }
            
            for(int j = 0; j < i; j++){
                ans += "a";
            }
            i++;
            ans += " ";
        }
        
        return ans.trim();
    }
}