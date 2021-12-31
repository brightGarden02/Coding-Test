class Solution {
public:
    bool isPalindrome(string s){
        
        int l = 0;
        int r = s.length()-1;
        while(l < r){
            if(s[l] != s[r]){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    
    string deleteIndex(int index, string s, int n){
        
        string tmp = "";
        for(int i = 0; i < index; i++){
            tmp += s[i];
        }
        for(int i = index+1; i < n; i++){
            tmp += s[i];
        }
        
        return tmp;
    }
    
    bool validPalindrome(string s) {
        
        int l = 0;
        int r = s.length()-1;
        int n = s.length();
        while(l < r){
            if(s[l] != s[r]){
                
                string newstring = deleteIndex(l, s, n);
                
                if(isPalindrome(newstring)){
                    return true;
                }
                
                newstring = deleteIndex(r, s, n);
                
                return isPalindrome(newstring);
            }
            l++;
            r--;
        }
        
        return true;
    }
};