class Solution {
public:
    bool backspaceCompare(string s, string t) {
        
        stack<char> st1;
        stack<char> st2;
        
        for(int i = 0; i < s.length(); i++){
            char tmp = s[i];
            if(!st1.empty()){
                
                if(tmp != '#') st1.push(tmp);
                else st1.pop();
                
            }
            else{
                if(tmp != '#') st1.push(tmp);
            }
        }
        
        for(int i = 0; i < t.length(); i++){
            char tmp = t[i];
            if(!st2.empty()){
                
                if(tmp != '#') st2.push(tmp);
                else st2.pop();
                    
            }
            else{
                if(tmp != '#') st2.push(tmp);
            }
        }
        
        return st1 == st2;
    }
};