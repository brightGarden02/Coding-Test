class Solution {
public:
    int minOperations(vector<string>& logs) {
        
        stack<string> stack;
        
        for(int i = 0; i < logs.size(); i++){
            
            if(logs[i] == "../"){
                if(!stack.empty())
                    stack.pop();
            }
            else if(logs[i] == "./"){
                continue;
            }
            else{
                stack.push(logs[i]);
            }
              
        }
        return stack.size();
        
    }
};