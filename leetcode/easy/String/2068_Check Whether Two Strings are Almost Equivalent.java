class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        
        int[] arr = new int[26];
        
        for(int i = 0; i < word1.length(); i++){
            
            int index = word1.charAt(i) - 'a';
            arr[index]++;
        }
        
        for(int i = 0; i < word2.length(); i++){
            
            int index = word2.charAt(i) - 'a';
            arr[index]--;
        }
        
        for(int i = 0; i < arr.length; i++){
            
            if(Math.abs(arr[i]) > 3){
                return false;
            }
        }
        
        return true;
    }
}