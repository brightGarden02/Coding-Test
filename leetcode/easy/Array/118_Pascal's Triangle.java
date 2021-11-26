class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> answer = new ArrayList<>();
        if(numRows == 0) return answer;
        answer.add(new ArrayList<>());
        answer.get(0).add(1);
        
        for(int row = 1; row < numRows; row++){
            List<Integer> currList = new ArrayList<>();
            
            for(int index = 0; index <= row; index++){
                int val = 1;
                if(index != 0 && index != row){
                    int topLeft = answer.get(row-1).get(index-1);
                    int topRight = answer.get(row-1).get(index);
                    val = topLeft + topRight;
                }
                currList.add(val);
            }
            answer.add(currList);
        }
        return answer;
        
    }
}