class Solution {
public:
    int minPairSum(vector<int>& nums) {
     
        sort(nums.begin(), nums.end());
        int l = 0, r = nums.size()-1;
        vector<int> v;
        while(l < r){
            int sumPair = nums[l] + nums[r];
            v.push_back(sumPair);
            l++;
            r--;
        }
        
        int ans = 0;
        for(int i = 0; i< v.size(); i++){
            ans = max(ans, v[i]);
        }
        
        return ans;
    }
};