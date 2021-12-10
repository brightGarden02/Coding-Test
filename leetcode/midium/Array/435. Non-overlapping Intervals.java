class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        Arrays.sort(intervals, (a,b) -> a[1]-b[1]);
        
        
        int rem = 0;
        int prevStart = intervals[0][0];
        int prevEnd = intervals[0][1];
        
        for(int r = 1; r < intervals.length; r++){
            int newStart = intervals[r][0];
            int newEnd = intervals[r][1];
            
                if(prevStart >= newStart
                  || prevEnd > newEnd
                   || prevEnd > newStart){
                    rem++;
                }
                else{
                    prevStart = newStart;
                    prevEnd = newEnd;
                }
        }
        
        return rem;
    }
}