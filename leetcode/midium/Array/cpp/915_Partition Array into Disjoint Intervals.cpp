class Solution {
public:
    int partitionDisjoint(vector<int>& nums) {
     
        int leftMax = nums[0];
        int rightMin = nums[0];
        int index = 0;
        for(int i = 1; i < nums.size(); i++){
            
            if(nums[i] < leftMax){
                index = i;
                leftMax = rightMin;
            }
            
            rightMin = max(nums[i], rightMin);
        }
        return index+1;
    }
};
