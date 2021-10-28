class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        
        int[] recLen = new int[rectangles.length];
        for(int i = 0; i < rectangles.length; i++){
            int len = 0;
            if(rectangles[i][0] < rectangles[i][1])
                len = rectangles[i][0];
            else
                len = rectangles[i][1];
            
            recLen[i] = len;
        }
        
        int max = 0;
        for(int i : recLen){
            if(i > max) max = i;
        }
        
        int answer = 0;
        for(int i : recLen){
            if(i == max) answer++;
        }
        
        return answer;
    }
}