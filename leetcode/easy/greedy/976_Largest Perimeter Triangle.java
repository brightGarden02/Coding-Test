class Solution {
    public int largestPerimeter(int[] nums) {
        
        int ans = 0;
        int n = nums.length;
        Integer[] arr = new Integer[n];
        for(int i = 0; i < n; i++){
            arr[i] = nums[i];
        }
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        for(int i = 0; i < n-2; i++){
            if(arr[i] < arr[i+1] + arr[i+2]){
                ans = Math.max(ans, arr[i] + arr[i+1] + arr[i+2]);
            }    
            
        }
        
        return ans;
    }
}
