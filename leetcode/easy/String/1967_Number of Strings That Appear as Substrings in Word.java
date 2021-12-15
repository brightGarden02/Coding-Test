class Solution {
    public int numOfStrings(String[] patterns, String word) {
        
        int ans = 0;
        for(int i = 0; i < patterns.length; i++){
            String str = patterns[i];
            if(word.contains(str)){
                ans++;
            }
            
        }
        return ans;
    }
}