class Solution {
public:
    int largestPerimeter(vector<int>& nums) {
        
        int pMax = 0;
        sort(nums.begin(), nums.end());
        
        for(int i = 2; i < nums.size(); i++){
            
            int a = nums[i-2];
            int b = nums[i-1];
            int c = nums[i];
            if(a+b > c && a+c > b && b+c > a){
                pMax = max(pMax, a+b+c);
            }
        }
        
        return pMax;
    }
};