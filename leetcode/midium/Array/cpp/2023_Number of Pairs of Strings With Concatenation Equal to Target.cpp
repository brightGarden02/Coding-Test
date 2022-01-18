class Solution {
public:
    int numOfPairs(vector<string>& nums, string target) {
        
        int ans = 0;
        for(int i = 0; i < nums.size()-1; i++){
            for(int j = i+1; j < nums.size(); j++){
                string tmp = nums[i] + nums[j];
                if(tmp == target){
                    ans++;
                }
            }
        }
        
        for(int i = nums.size()-1; i >= 1; i--){
            for(int j = i-1; j >= 0; j--){
                string tmp = nums[i] + nums[j];
                if(tmp == target){
                    ans++;
                }
            }
        }
        
        return ans;
    }
};