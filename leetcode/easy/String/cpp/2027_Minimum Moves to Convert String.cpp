class Solution {
public:
    int minimumMoves(string s) {
        
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            
            if(s[i] == 'X'){
                    
                ans++;
                s.replace(i, 3, "OOO");
            }
        }
        
        return ans;
    }
};