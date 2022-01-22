class Solution {
public:
    int jump(vector<int>& nums) {
        
        int n = nums.size();
        int i = 0;
        int jumps = 0;
        
        int maxJump = 0;
        int lastJumpi = 0;
        
        while(lastJumpi < n-1){
            
            maxJump = max(maxJump, i + nums[i]);
            
            if(i == lastJumpi){
                lastJumpi = maxJump;
                jumps++;
            }
            i++;
        }
        
        return jumps;
    }
};