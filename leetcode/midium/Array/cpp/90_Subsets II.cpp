class Solution {
public:
    vector<vector<int>> ans;
    vector<int> cur;
    vector<vector<int>> subsetsWithDup(vector<int>& nums) {
        
        sort(nums.begin(), nums.end());
        bt(nums, 0);
        return ans;
    }
    
    void bt(vector<int>& nums, int starti){
        
        ans.push_back(cur);
        
        for(int i = starti; i < nums.size(); i++){
            if(i != starti && nums[i] == nums[i-1])
                continue;
            
            cur.push_back(nums[i]);
            
            bt(nums, i+1);
            
            cur.pop_back();
        }
    }
};