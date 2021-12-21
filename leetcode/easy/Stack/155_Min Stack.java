class MinStack {
    
    List<Integer> list;
    public MinStack() {
        list = new ArrayList<>();
    }
    
    public void push(int val) {
        list.add(list.size(), val);
    }
    
    public void pop() {
        list.remove(list.size()-1);
        
    }
    
    public int top() {
        return list.get(list.size()-1);
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(Integer tmp : list){
            
            if(min > tmp){
                min = tmp;
            }
        }
        return min;
    }
}