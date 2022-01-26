class Solution {
public:
    int evalRPN(vector<string>& tokens) {
        
        stack<int> st;
        for(string s : tokens){
            
            if(isdigit(s[0]) || (s.size() > 1 && isdigit(s[1])) ){
                int num = stoi(s);
                st.push(num);
            }
            else{
                int num2 = st.top();
                st.pop();
                
                int num1 = st.top();
                st.pop();
                int ans = 0;
        
                if(s[0] == '+'){
                    ans = num1 + num2;
                }
                else if(s[0] == '-'){
                    ans = num1 - num2;
                }
                else if(s[0] == '*'){
                    ans = num1 * num2;
                }
                else if(s[0] == '/'){
                    ans = num1 / num2;
                }
                st.push(ans);
            }    
        }
        
     return st.top();   
    }
};