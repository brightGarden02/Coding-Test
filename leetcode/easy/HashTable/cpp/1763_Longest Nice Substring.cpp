class Solution {
public:
    string longestNiceSubstring(string s) {
        
        if(s.size() < 2) return "";
        unordered_set<char> st(begin(s), end(s));
        
        for(int i = 0; i < s.size(); i++){
            
            char upper = toupper(s[i]);
            char lower = tolower(s[i]);
            
            if(st.find(upper) == end(st)
               || st.find(lower) == end(st)){
            
                string s1 = longestNiceSubstring(s.substr(0, i));
                string s2 = longestNiceSubstring(s.substr(i+1));
                
                
                return s1.size() >= s2.size() ? s1 : s2;
                
            }
        }
        
        return s;
    }
};