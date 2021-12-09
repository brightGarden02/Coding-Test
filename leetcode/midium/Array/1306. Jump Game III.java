class Solution {
    public boolean canReach(int[] arr, int start) {
        
        int n = arr.length;
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        
        while(!q.isEmpty()){
            
            int idx = q.poll();
            
            if(arr[idx] == 0) return true;
            
            if(arr[idx] < 0) continue;
            
            if(idx + arr[idx] < n)
                q.add(idx + arr[idx]);
            if(idx - arr[idx] >= 0)
                q.add(idx - arr[idx]);
            
            arr[idx] = -arr[idx];
        }
        
        return false;
    } 
}