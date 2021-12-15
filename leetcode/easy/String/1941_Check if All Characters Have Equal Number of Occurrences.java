class Solution {
    public boolean areOccurrencesEqual(String s) {
        
        int[] array = new int[26];
        
        for(int i = 0; i < s.length(); i++){
            
            int p = s.charAt(i) - 'a';
            array[p]++;
        }
        
        int tmp = 0;
        for(int i = 0; i < array.length; i++){
            
            if(array[i] == 0){
                continue;
            } 
            else if(tmp != 0 && tmp != array[i]){
                return false;
            }
            tmp = array[i];
        }
        
        return true;
    }
}