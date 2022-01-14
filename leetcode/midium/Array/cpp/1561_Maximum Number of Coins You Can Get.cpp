class Solution {
public:
    int maxCoins(vector<int>& piles) {
        
        sort(piles.begin(), piles.end());
        int ans = 0;
        for(int i = 0; i < piles.size(); i++){
            
            piles.pop_back();
            int n = piles.size()-1;
            int secondVal = piles[n];
            piles.pop_back();
            
            ans += secondVal;
        }
        
        return ans;
    }
};