class Solution {
public:
    void wiggleSort(vector<int>& nums) {
    
        vector<int> reverseSorted(nums);
        sort(reverseSorted.rbegin(), reverseSorted.rend());
        int n = nums.size(), m = n | 1;
        
        for(int i = 0; i < n; i++){
            nums[(2*i+1) % m] = reverseSorted[i];
        }
            
    }
};