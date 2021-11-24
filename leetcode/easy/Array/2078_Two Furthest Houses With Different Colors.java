class Solution {
    public int maxDistance(int[] colors) {
        
        int dis = 0;
        int maxDis = 0;
        for(int i = 0; i < colors.length-1; i++){
            
            for(int j = i+1; j < colors.length; j++){
                if(colors[i] != colors[j]){
                    dis = j-i;   
                    maxDis = Math.max(dis, maxDis);
                }
            }
            
        }
        return maxDis;
    }
}