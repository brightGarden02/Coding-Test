class Solution {
public:
    int maxScore(string s) {
        
        int n = s.length();
        int score = 0;
        for(int i = 1; i < n; i++){
            
            int zeros = 0;
            int ones = 0;
            string left = s.substr(0, i);
            for(int j = 0; j < left.length(); j++){
                if(left[j] == '0'){
                    zeros++;
                }
            }
            
            string right = s.substr(i, n-i);
            for(int j = 0; j < right.length(); j++){
                if(right[j] == '1'){
                    ones++;
                }
            }
            
            score = max(score, zeros + ones);
        }
        
        return score;
    }
};