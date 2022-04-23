class Solution {
    public int maxDistance(int[] colors) {
        
        int l = 0;
        int r = colors.length-1;
        int dis1 = 0, dis2 = 0;
        while(l <= r){
            
            if(colors[l] == colors[r]){
                r--;
            }
            else{
                dis1 = r-l;
                break;
            }
            
        }
        
        l = 0;
        r = colors.length-1;
        while(l <= r){
            
            if(colors[l] == colors[r]){
                l++;
            }
            else{
                dis2 = r-l;
                break;
            }
            
        }
        
        return Math.max(dis1, dis2);
    }
}
