class Solution {
    public String reverseWords(String s) {
        
        StringBuffer sb = new StringBuffer();
        String[] array = s.split(" ");
        
        for(int i = 0; i < array.length; i++){
            
            StringBuffer tmpSb = new StringBuffer(array[i]);
            sb.append(tmpSb.reverse());
            
            if(i < array.length-1)
                sb.append(" ");
            
        }
        return sb.toString();
    }
}