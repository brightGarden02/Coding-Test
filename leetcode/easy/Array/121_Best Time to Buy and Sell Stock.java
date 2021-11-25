class Solution {
    public int maxProfit(int[] prices) {
        
        int maxPrice = 0;
        int min = prices[0];
        
        for(int i = 1; i < prices.length; i++){
            
            if(maxPrice < prices[i] - min)
                maxPrice = prices[i] - min;
            
            if(min > prices[i])
                min = prices[i];
        }
        
        return maxPrice;
    }
}