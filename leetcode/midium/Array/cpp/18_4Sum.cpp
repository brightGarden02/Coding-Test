class Solution {
public:
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
        
        sort(nums.begin(), nums.end());
        int n = nums.size();
        vector<vector<int>> ans;
        set<vector<int>> store;
        
        
        for(int i = 0; i < n-3; i++){
            
            for(int j = i+1; j < n-2; j++){
            
                int new_target  =  target - nums[i] - nums[j];
                
                int k = j+1;
                int l = n-1;
                while(k < l){
                    int temp = nums[k] + nums[l];
                    if(temp > new_target){
                        l--;
                    }
                    else if(temp < new_target){
                        k++;
                    }
                    else{
                        
                        store.insert({nums[i] , nums[j] , nums[k] , nums[l]});
                        l--;
                        k++;
                    }
                }
            }
        }
        
         for(auto i : store){
            ans.push_back(i); 
        }
        
        return ans;
    }
};