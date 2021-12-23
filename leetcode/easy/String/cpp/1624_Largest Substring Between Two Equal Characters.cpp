class Solution {
public:
    int maxLengthBetweenEqualCharacters(string s) {

        vector<int> v(26, -1);
        int maxI = -1;
        for(int i = 0; i < s.length(); i++){
            char tmp = s[i];
            int pos = tmp - 'a';
            if(v[pos] == -1){
                v[pos] = i;
            }
            else{
                maxI = max(maxI, i - v[pos] - 1); 
            }
        }
        
        return maxI;
    }
};