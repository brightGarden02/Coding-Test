class Solution {
public:
    int maxNumberOfBalloons(string text) {
        
        unordered_map<char, int> mp;
        int ans = 0;
        
        for(char c : text){
            
            if(c == 'b' || c == 'a' || c == 'l' || c == 'o' || c == 'n'){
                mp[c]++;
            }
            
        }
        
        while(mp['b'] >= 1 && mp['a'] >= 1 && mp ['l'] >= 2 && mp['o'] >= 2 && mp['n'] >= 1){
            
            ans++;
            mp['b']--;
            mp['a']--;
            mp['l'] -= 2;
            mp['o'] -= 2;
            mp['n']--;
            
        }
        
        return ans;
    }
};