class Solution {
    public String reverseWords(String s) {
        
        int start = 0;
        StringBuilder sb = new StringBuilder();
        char[] c = s.toCharArray();
        
        for(int i = 0; i < c.length; i++){
            if(c[i] == ' '){
                sb.append(reverse(Arrays.copyOfRange(c, start, i)));
                start = i+1;
                sb.append(c[i]);
            }
            else if(i == c.length-1)
                sb.append(reverse(Arrays.copyOfRange(c, start, i+1)));
        }
        return sb.toString();
        
    }
    
    public String reverse(char[] c){
        
        int start = 0, end = c.length-1;
        while(start < end){
            
            char tmp = c[start];
            c[start] = c[end];
            c[end] = tmp;
            start++;
            end--;
            
        }
        return String.valueOf(c);
    }
}