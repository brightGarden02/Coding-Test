class Solution {
    
    List<List<Integer>> list = new ArrayList<>();
    LinkedList<Integer> tmpList = new LinkedList<>();
        
    public List<List<Integer>> combine(int n, int k) {
        
        bt(n, k, 1);
        return list;
    }
    
    public void bt(int n, int k, int start){
        
        if(tmpList.size() == k){
            
            list.add(new ArrayList<>(tmpList));
            return;
        }
        
        for(int i = start; i <= n && tmpList.size() < k ; i++){
            tmpList.add(i);
            bt(n, k, i+1);
            tmpList.removeLast();
        }
        
        
    }
}