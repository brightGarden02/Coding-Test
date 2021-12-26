class Solution {
public:
    bool isPrefixString(string s, vector<string>& words) {
        
        string str;
        for(auto &i : words){
            
            str += i;
            if(str == s) return true;
            
        }
        return false;
    }
};