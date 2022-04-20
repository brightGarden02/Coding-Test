class Solution {
    public int minCostToMoveChips(int[] position) {
        
        int n = position.length;
        int even = 0;
        for(int i = 0; i < n; i++){
            
            if(position[i] % 2 == 0){
                even++;
            }
        }
        
        return Math.min(even, n - even);
    }
}
