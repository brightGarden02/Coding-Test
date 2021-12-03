class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            char tmp = s.charAt(i);
            if(tmp == '(' || tmp == '{' || tmp == '['){
                stack.push(tmp);
            } 
            else if(tmp == ')' || tmp == '}' || tmp == ']'){
                if(!stack.isEmpty()){
                    if(tmp == ')' && stack.peek() == '('){
                        stack.pop();   
                     }
                    else if(tmp == ']' && stack.peek() == '['){
                        stack.pop();   
                     }
                    else if(tmp == '}' && stack.peek() == '{'){
                        stack.pop();   
                     }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
                
            }
        }
        if(!stack.isEmpty())
            return false;
        return true;
    }
}