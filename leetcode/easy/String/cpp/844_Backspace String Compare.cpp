class Solution {
public:
    bool backspaceCompare(string s, string t) {
        
        stack<char> st1;
        stack<char> st2;
        
        backspaceStack(st1, s);
        backspaceStack(st2, t);
        
        return st1 == st2;
    }
    
    void backspaceStack(stack<char> &stack, string str){
        
        for(int i = 0; i < str.length(); i++){
            char tmp = str[i];
            if(!stack.empty()){
                
                if(tmp != '#') stack.push(tmp);
                else stack.pop();
                
            }
            else if(tmp != '#'){
                stack.push(tmp);
            }
        }
    }
    
};
