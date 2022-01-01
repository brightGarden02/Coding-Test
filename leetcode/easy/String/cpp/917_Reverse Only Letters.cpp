class Solution {
public:
    string reverseOnlyLetters(string s) {
        
        int l = 0;
        int r = s.length()-1;
        
        while(l < r){
            
            bool left = checkBoolean(s[l]);
            bool right = checkBoolean(s[r]);
            
            if(left == true && right == true){
                char tmp = s[l];
                s[l] = s[r];
                s[r] = tmp;
                r--;
                l++;
            }
            else if(left == true && right == false){
                r--;
            }
            else if(left == false && right == true){
                l++;
            }
            else if(left == false && right == false){
                l++;
                r--;
            }
            
        }
        
        return s;
    }
    
    bool checkBoolean(char c){
        
        if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
            return true;
        }
        return false;
    }
};
