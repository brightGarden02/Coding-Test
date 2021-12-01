class Solution {
    
    public List<String> letterCasePermutation(String s) {
        
        List<String> list = new ArrayList<>();
        bt(s.toCharArray(), list, 0);
        
        return list;
    }
    
    public void bt(char[] c, List<String> list, int start){
        
        String tmp = new String(c);
        list.add(tmp);
        
        for(int i = start; i < c.length; i++){
            
            if(Character.isAlphabetic(c[i])){
                
                char bkp = c[i];
                c[i] = Character.isUpperCase(c[i]) ? Character.toLowerCase(c[i]) : Character.toUpperCase(c[i]);
                bt(c, list, i+1);
                
                c[i] = bkp;
                
            }
            
            
        }
        
    }
    
}