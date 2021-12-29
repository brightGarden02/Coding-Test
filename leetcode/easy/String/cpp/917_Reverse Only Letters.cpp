class Solution {
public:
    string reverseOnlyLetters(string s) {
        
        int l = 0;
        int r = s.length()-1;
        
        while(l < r){
            
            bool left = false;
            bool right = false;
        
            if( (s[l] >= 'a' && s[l] <= 'z') || ( s[l] >= 'A' && s[l] <='Z')){
                left = true;
            }
            if( (s[r] >= 'a' && s[r] <= 'z') || ( s[r] >= 'A' && s[r] <='Z')){
                right = true;
            }
            
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
};
