class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> answer = new LinkedList<>();
        
        
        for(int[] tmp : intervals){
            
            if(answer.isEmpty() || answer.getLast()[1] < tmp[0])
                answer.add(tmp);
            else if(answer.getLast()[1] >= tmp[0])
                answer.getLast()[1] = Math.max(answer.getLast()[1], tmp[1]);
        }
        
        return answer.toArray(new int[answer.size()][]);
    }
}