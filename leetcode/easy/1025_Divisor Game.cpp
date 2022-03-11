class Solution {
public:
    bool divisorGame(int n) {
        
        vector<bool> dp(n+1);
        dp[1] = false;
        for(int i = 2; i <= n; i++){
            
            dp[i] = false;
            for(int j = i-1; j >= 1; j--){
                
                if(i%j == 0 && dp[i-j] == false){
                     dp[i] = true;
                }
            }
        }
        
        return dp[n];
    }
};