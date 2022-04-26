class Solution {
    public int minimumCost(int[] cost) {
        
        int n = cost.length;
        if(n == 1){
            return cost[0];
        }
        else if(n == 2){
            return cost[0] + cost[1];
        }
        
        Arrays.sort(cost);
        
        int j = 1;
        int sum = 0;
        for(int i = n-1; i >= 0; i--){
            if(j % 3 == 0){
                j = 1;
                continue;
            }
            else{
                sum += cost[i];
                j++;
            }
            
        }
        
        return sum;
    }
}
