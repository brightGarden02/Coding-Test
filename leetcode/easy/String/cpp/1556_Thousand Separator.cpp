class Solution {
public:
    string thousandSeparator(int n) {
        
        string strN = to_string(n);
        string ans;
        int j = 0;
        for(int i = strN.length()-1; i >= 0; i--){
            
            if(j != 0 && j%3 == 0){
                ans = "." + ans;
            }
            ans = strN[i] + ans;
            j++;
        }
        
        return ans;
    }
};