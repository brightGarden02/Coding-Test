class Solution {
    public int countGoodSubstrings(String s) {
   
        int ans = 0;
        for(int i = 0; i < s.length()-2; i++){
            
            String str = s.substring(i, i+3);
            int[] array = new int[26];
            int count = 0;
            for(char c : str.toCharArray()){
                
                int p = c - 'a';
                array[p]++;
            }
            
            for(int j = 0; j < array.length; j++){
                if(array[j] > 1){
                    count = 0;
                    break;
                }
                else if(array[j] == 1){
                    count++;
                }
            }
            
            if(count == 3){
                ans++;
            }
            
        }
        
        return ans;
    }
}