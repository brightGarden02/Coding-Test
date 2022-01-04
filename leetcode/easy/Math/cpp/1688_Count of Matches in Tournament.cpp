class Solution {
public:
    int numberOfMatches(int n) {
        
        int ans = 0;
        int teamAdvance = n;
        int matches = 0;
        while(teamAdvance != 1){
            
            if(teamAdvance%2 == 0){
                teamAdvance = teamAdvance/2;
            }
            else{
                teamAdvance = teamAdvance - teamAdvance/2;
            }
            matches = n - teamAdvance;
            n = n - matches;
            ans = ans + matches;
        }
        
        return ans;
    }
};