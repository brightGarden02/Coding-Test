class Solution {
public:
    bool checkZeroOnes(string s) {
        
        int one = 0;
        int zero = 0;
        int maxOne = 0;
        int maxZero = 0;
        
        for(int i = 0; i < s.length(); i++){
            
            if(s[i] == '1'){
                one++;
            }
            else{
                one = 0;
            }
            if(s[i] == '0'){
                zero++;
            }
            else{
                zero = 0;
            }
            
            maxZero = max(zero, maxZero);
            maxOne = max(one, maxOne);
            
        }
        
        if(maxOne > maxZero) return true;
        else return false;
        
    }
};