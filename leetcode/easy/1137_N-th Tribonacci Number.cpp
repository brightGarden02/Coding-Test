class Solution {
public:
    unordered_map<int, int> memo;
    int dp(int n){
        memo[0] = 0;
        memo[1] = 1;
        memo[2] = 1;
        
        if(memo.find(n) == memo.end()){
            memo[n] = dp(n-3) + dp(n-2) + dp(n-1);
        }
        return memo[n];
    }
    
    int tribonacci(int n) {
        return dp(n);
    }
};