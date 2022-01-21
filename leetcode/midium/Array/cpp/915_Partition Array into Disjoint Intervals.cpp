class Solution {
public:
    int partitionDisjoint(vector<int>& nums) {
     
        int rightMin = nums[0];
        int leftMax = nums[0];
        int index = 0;
        for(int i = 1; i < nums.size(); i++){
            
            if(nums[i] < rightMin){
                index = i;
                rightMin = leftMax;
            }
            
            leftMax = max(nums[i], leftMax);
        }
        return index+1;
    }
};
