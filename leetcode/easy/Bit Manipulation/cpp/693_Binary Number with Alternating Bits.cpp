class Solution {
public:
    bool hasAlternatingBits(int n) {
        
        string s = to_binary(n);
        for(int i = 1; i < s.size(); i++){
            if(s[i-1] == s[i]) return false;
        }
        
        return true;
    }
    
    string to_binary(int n){
        
        string b;
        while(n){
            int r = n % 2;
            b = to_string(r) + b;
            n = n / 2;
        }
        
        return b;
    }
};