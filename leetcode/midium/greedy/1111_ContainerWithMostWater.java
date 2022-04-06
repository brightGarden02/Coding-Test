class Solution {
    public int maxArea(int[] height) {
        
        int l = 0;
        int r = height.length-1;
        int area = 0;
        int maxArea = 0;
        while(l < r){
            
            if(height[l] <= height[r]){
                area = height[l] * (r-l);
                maxArea = Math.max(maxArea, area);
                l++;
            }
            else{
                area = height[r] * (r-l);
                maxArea = Math.max(maxArea, area);
                r--;
            }
        }
        
        return maxArea;
    }
}
