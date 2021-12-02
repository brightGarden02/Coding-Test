class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        List<List<Integer>> dp = new ArrayList<>();
        for(int i = 0; i < triangle.size(); i++) {
        	
            dp.add(new ArrayList<>());
        }
        
        dp.set(dp.size() - 1, triangle.get(triangle.size() - 1));
        for(int i = dp.size() - 2; i >= 0; i--) {
            
        	for(int j = 0; j < triangle.get(i).size(); j++) {
        		
                dp.get(i).add(triangle.get(i).get(j) + Math.min(dp.get(i+1).get(j),                       dp.get(i+1).get(j+1)));
        	
            }
        }
        
        return dp.get(0).get(0);
    }
}