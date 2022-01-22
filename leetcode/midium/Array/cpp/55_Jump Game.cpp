class Solution {
public:
    bool canJump(vector<int>& nums) {
        
        if(nums.size() == 1) return true;
        
        int lastIndex = nums.size()-1;
        
        int maxRange = 0;
        for(int i = 0; i < nums.size(); i++){
            
            maxRange = max(maxRange, i+nums[i]);
            
            if(maxRange == i)
                return false;
            else{
                if(maxRange >= lastIndex){
                    return true;
                }
            }
        }
        
        return true;
    }
};