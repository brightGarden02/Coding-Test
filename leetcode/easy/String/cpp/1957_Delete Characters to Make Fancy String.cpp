class Solution {
public:
    string makeFancyString(string s) {
        
        string ans = "";
        int i = 0;
        int n = s.length();
        char tmp;
        
        while(i < n){
            if(s[i] == s[i+1]){
                tmp = s[i];
                ans += tmp;
                ans += tmp;
                i = i+2;
                
                while(s[i] == tmp){
                    i++;
                }
                
            }
            else{
                ans += s[i];
                i++;
            }
            
        }
        return ans;
    }
};