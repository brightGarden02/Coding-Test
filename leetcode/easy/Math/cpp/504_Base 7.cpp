class Solution {
public:
    string convertToBase7(int num) {
        
        if(num == 0) return "0";
        
        bool minus = false;
        if(num < 0) {
            minus = true;
            num = -num;
        }
            
        string ans = "";
        while(num){
            int rem = num % 7;
            ans = to_string(rem) + ans;
            num = num / 7;
        }
        
        if(minus) ans = "-" + ans;
        
        return ans;
    }
};