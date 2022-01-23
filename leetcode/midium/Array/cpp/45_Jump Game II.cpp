class Solution {
public:
    int jump(vector<int>& nums) {
        
        int n = nums.size();
        int i = 0;
        int jumps = 0;
        
        int maxRange = 0;
        int lastJumpedPos = 0;
        
        while(lastJumpedPos < n-1){
            
            maxRange = max(maxRange, i + nums[i]);
            
            if(i == lastJumpedPos){
                lastJumpedPos = maxRange;
                jumps++;
            }
            i++;
        }
        
        return jumps;
    }
};
