class Solution {
public:
    int numberOfMatches(int n) {
        
        int ans = 0;
        int teamAdv = n;
        int matches = 0;
        while(teamAdv != 1){
            
            if(teamAdv%2 == 0){
                teamAdv = teamAdv/2;
            }
            else{
                teamAdv = teamAdv - teamAdv/2;
            }
            matches = n - teamAdv;
            n = n - matches;
            ans = ans + matches;
        }
        
        return ans;
    }
};
