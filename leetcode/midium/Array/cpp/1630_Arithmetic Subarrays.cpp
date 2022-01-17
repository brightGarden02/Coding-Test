class Solution {
public:
    vector<bool> checkArithmeticSubarrays(vector<int>& nums, vector<int>& l, vector<int>& r) {
        
        vector<bool> ans;
        
        for(int i = 0; i < l.size(); i++){
            
            int starti = l[i];
            int endi = r[i];
            vector<int> v;
            for(int j = starti; j <= endi; j++){
                v.push_back(nums[j]);
            }
            
            sort(v.begin(), v.end());
            
            int diff = v[1] - v[0];
            bool check = false;
            for(int j = 1; j < v.size(); j++){
                if(v[j] - v[j-1] != diff){
                    check = false;
                    break;
                }
                else{
                    check = true;
                }
            }
            ans.push_back(check);
        }
        
        return ans;
    }
};