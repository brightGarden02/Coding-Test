class NumMatrix {
    vector<vector<long>> dp;
    
public:
    NumMatrix(vector<vector<int>>& matrix) {
        
        int ylen = matrix.size() + 1, xlen = matrix[0].size() + 1;
        dp = vector<vector<long>>(ylen, vector<long>(xlen, 0));
        
        for (int i = 1; i < ylen; i++){
            for (int j = 1; j < xlen; j++){
                dp[i][j] = matrix[i-1][j-1] + dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1];       
            }    
        }      
    }
    
    int sumRegion(int r1, int c1, int r2, int c2) {
        
        return (int)(dp[r2+1][c2+1] - dp[r2+1][c1] - dp[r1][c2+1] + dp[r1][c1]);
    }
};