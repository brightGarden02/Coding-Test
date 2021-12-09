class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> ans = new ArrayList<>();
        
        if(rowIndex == 0){
            ans.add(1);
            return ans;
        }
        
        List<Integer> pre = getRow(rowIndex - 1);
        
        ans.add(1);
        for(int i = 1; i < pre.size(); i++){
            
            ans.add(pre.get(i) + pre.get(i-1));
            
        }
        ans.add(1);
        return ans;
        
    }
}