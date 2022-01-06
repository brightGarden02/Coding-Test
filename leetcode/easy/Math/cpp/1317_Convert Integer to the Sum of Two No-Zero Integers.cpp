class Solution {
public:
    vector<int> getNoZeroIntegers(int n) {
        
        vector<int> ans;
        for(int i = 1; i < n; i++){
            int A = i, B = n-i;
            if(nonZeroSum(A) && nonZeroSum(B))
                return {A, B};
        }
        
        return ans;
    }
    
    bool nonZeroSum(int n){
        
        while(n){
            int rem = n%10;
            if(rem == 0) return false;
            n = n/10;
        }
        return true;
    }
};