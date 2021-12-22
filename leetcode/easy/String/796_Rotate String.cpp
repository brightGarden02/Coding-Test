class Solution {
public:
    bool rotateString(string s, string goal) {
        
        for(int i = 0; i < s.length(); i++){
            
            char curr = s[0];
            char next;
            for(int j = 1; j < s.length(); j++){
                
                next = s[j];
                s[j] = curr;
                curr = next;
                
            }
            
            s[0] = next;
            
            if(s == goal){
                return true;
            }
        }
        return false;
        
    }
};