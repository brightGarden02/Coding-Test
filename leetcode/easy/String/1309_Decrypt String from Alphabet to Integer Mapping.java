class Solution {
    public String freqAlphabets(String s) {
        
        String ans = "";
        String tmpStr = "";
        char tmpChar = ' ';
        int tmpInt = 0;
        
        for(int i = s.length()-1; i >= 0; i--){
            
            if(s.charAt(i) == '#'){
                tmpStr = s.charAt(i-2) + "" + s.charAt(i-1);
                tmpInt = Integer.parseInt(tmpStr);
                tmpChar = (char)(tmpInt + 96);
                i -= 2;
            }
            else{
                tmpInt = (s.charAt(i) - '0');
                tmpChar = (char)(tmpInt + 96);
            }
            ans = tmpChar + ans;
        }
        
        return ans;
    }
}