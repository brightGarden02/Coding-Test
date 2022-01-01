class Solution {
public:
    bool isIsomorphic(string s, string t){
        
        if(s.size() != t.size()) return false;
        
        return isomorphic(s, t) && isomorphic(t, s);
    }
    
    bool isomorphic(string s, string t){
        
        unordered_map<char, char> map;
        for(int i = 0; i < s.size(); i++){
            
            if(map.find(s[i]) != map.end())
            {
                if(map[s[i]] != t[i])
                    return false;
            }
            map[s[i]] = t[i];
        }
        
        return true;
    }
};