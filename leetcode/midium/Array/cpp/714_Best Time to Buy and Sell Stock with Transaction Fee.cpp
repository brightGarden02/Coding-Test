class Solution {
public:
    int maxProfit(vector<int>& prices, int fee) {
        
        int buy = 0, sell = -100000;
        for(int i = 0; i < prices.size(); i++) {
            
            buy = max(buy, sell + prices[i] - fee);
            
            sell = max(sell, buy - prices[i]);
        }
        
        return buy;
    }
};