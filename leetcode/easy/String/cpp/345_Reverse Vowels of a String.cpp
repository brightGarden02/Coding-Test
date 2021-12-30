class Solution {
public:
    string reverseVowels(string s) {
        
        int l = 0;
        int r = s.length()-1;
        
        while(l < r){
            
            if(isVowel(s[l]) && isVowel(s[r])){
                char tmp = s[l];
                s[l] = s[r];
                s[r] = tmp;
                l++;
                r--;
            }
            else if(isVowel(s[l])){
                r--;
            }
            else{
                l++;
            }
            
        }
        return s;
    }
    
    bool isVowel(char c){
        
        if((c == 'a' || c == 'A') || (c == 'e' || c == 'E') || (c == 'i' || c == 'I') ||
         (c == 'o' || c == 'O') || (c == 'u' || c == 'U')){
            return true;
        }
        return false;
    }
    
};
