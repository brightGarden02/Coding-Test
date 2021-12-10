class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        
        int lines = 0;
        int sum = 0;
        
        for(int i = 0; i < s.length(); i++){
            
            sum += widths[s.charAt(i) - 'a'];
            if(sum > 100){
                sum = 0;
                sum += widths[s.charAt(i) - 'a'];
                lines++;
            }
        }
        lines++;
        
       return new int[]{lines, sum}; 
    }
}