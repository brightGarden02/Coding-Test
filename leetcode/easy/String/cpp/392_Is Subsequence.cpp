class Solution {
public:
    bool isSubsequence(string s, string t) {
        
        int s_size = 0;
        int j = 0;
        for(int i = 0; i < t.size(); i++){
            
            if(t[i] == s[j]){
                s_size++;
                j++;
            }
        }
        
        if(s_size == s.size()) return true;
        return false;
    }
};