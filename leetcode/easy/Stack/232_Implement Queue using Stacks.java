class MyQueue {
    
    Stack<Integer> stack;
    
    public MyQueue() {
        stack = new Stack<>();
    }
    
    public void insertBottom(Stack<Integer> stack, int x){
        
        if(stack.isEmpty()){
            stack.push(x);
        }    
        else{
            int tmp = stack.pop();
            insertBottom(stack, x);
            stack.push(tmp);
        }        
    }
    
    
    public void push(int x) {
        insertBottom(stack, x);
    }
    
    public int pop() {
        int top = stack.pop();
        return top;
    }
    
    public int peek() {
        int top = stack.peek();
        return top;
    }
    
    public boolean empty() {
        return stack.isEmpty();    
    }
}