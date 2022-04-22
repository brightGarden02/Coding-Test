class Solution {
    public int minTimeToType(String word) {
        
        int clock = 0;
        int counterClock = 0;
        int n = word.length();
        
        char start = 'a';
        int ans = 0;
        for(int i = 0; i < n; i++){
            
            clock = Math.abs(word.charAt(i) - start);
            counterClock = 26 - Math.abs(word.charAt(i) - start);
            start = word.charAt(i);
            
            ans += Math.min(clock, counterClock);
            ans++;
        }
        
        return ans;
    }
}
