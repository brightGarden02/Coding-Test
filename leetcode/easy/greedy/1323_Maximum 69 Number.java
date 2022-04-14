class Solution {
    public int maximum69Number (int num) {
        
        String s = Integer.toString(num);
        String numS = "";
        for(int i = 0; i < s.length(); i++){
            
            if(s.charAt(i) == '6'){
                numS += s.substring(0, i) + '9' + s.substring(i+1);
                break;
            }
            
        }
        if(numS.equals("")){
            return num;
        }
        
        num = Integer.parseInt(numS);
        
        return num;
    }
}
