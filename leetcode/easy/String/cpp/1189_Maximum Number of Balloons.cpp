class Solution {
public:
    int maxNumberOfBalloons(string text) {
        
        unordered_map<char, int> map;
        int ans = 0;
        
        for(char c : text){
            if(c == 'b' || c == 'a' || c == 'l' || c == 'o' || c == 'n'){
                map[c]++;
            }
        }
        
        while(map['b'] >= 1 && map['a'] >= 1 && map ['l'] >= 2 && map['o'] >= 2 && map['n'] >= 1){
            ans++;
            map['b']--;
            map['a']--;
            map['l'] -= 2;
            map['o'] -= 2;
            map['n']--;
        }
        
        return ans;
    }
};
