class Solution {
    public int[] diStringMatch(String s) {
        
        int[] array = new int[s.length()+1];
        int min = 0;
        int max = s.length();
        
        int i = 0;
        for(; i < s.length(); i++){
            if(s.charAt(i) == 'I'){
                array[i] = min;
                min++;
            }
            else{
                array[i] = max;
                max--;
            }
            
        }
        if(s.charAt(s.length()-1) == 'I'){
            array[i] = min;
        }
        else{
            array[i] = max;
        }
        
        return array;
    }
}