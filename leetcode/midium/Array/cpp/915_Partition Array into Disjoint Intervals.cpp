class Solution {
public:
    int partitionDisjoint(vector<int>& nums) {
     
        int min_num = nums[0];
        int max_num = nums[0];
        int index = 0;
        for(int i = 1; i < nums.size(); i++){
            
            if(nums[i] < min_num){
                index = i;
                min_num = max_num;
            }
            
            max_num = max(nums[i], max_num);
        }
        return index+1;
    }
};