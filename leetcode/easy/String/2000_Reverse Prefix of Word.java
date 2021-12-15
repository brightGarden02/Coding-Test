class Solution {
    public String reversePrefix(String word, char ch) {
        
        String ans = "";
        int end = -1;
        for(int i = 0; i < word.length(); i++){
            
            if(word.charAt(i) == ch){
                end = i;
                break;
            }
        }
        if(end == -1) return word;
        
        String strFront = word.substring(0, end+1);
        String strLast = word.substring(end+1, word.length());
        
        StringBuffer sb = new StringBuffer(strFront);
        strFront = sb.reverse().toString();
        
        ans = strFront + strLast;
        return ans;
    }
}