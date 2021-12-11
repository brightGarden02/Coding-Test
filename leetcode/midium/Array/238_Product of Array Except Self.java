class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] products = new int[nums.length];
        
		int cumulative = 1;
        for (int i = 0; i < nums.length; i++) {
        
            products[i] = cumulative;
            cumulative = cumulative * nums[i];
            
        }
		
		cumulative = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
        
            products[i] = products[i]  * cumulative;
            cumulative = cumulative * nums[i];
        
        }
        
        return products;
    }
}