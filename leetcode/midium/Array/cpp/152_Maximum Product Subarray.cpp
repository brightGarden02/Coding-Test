class Solution {
public:
    int maxProduct(vector<int>& nums) {
        
        int n = nums.size(), ans = nums[0], l = 1, r = 1;
        for(int i = 0; i < n; i++) {
            
            l =  (l) * nums[i];
            r =  (r) * nums[n - 1 - i];
            
            ans = max(ans, max(l, r));
            
            if(l == 0) l = 1;
            if(r == 0) r = 1;
        }
        
        return ans;
    }
};