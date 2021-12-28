class Solution {
public:
    string modifyString(string s) {
        
        char ch = 'a';
        for(int i = 0; i < s.length(); i++){
            
            if(s[i] == '?'){
                if(i == 0){
                    if(ch == s[i+1]) ch++;
                    
                }
                else if(i == s.length()-1){
                    if(ch == s[i-1]) ch++;

                }
                else{
                    while(ch == s[i-1] || ch == s[i+1]) ch++;

                }    
                
                s[i] = ch;
                ch = (ch == 'z') ? 'a' : ch;
            
            }
            
        }
        return s;
        
    }
};