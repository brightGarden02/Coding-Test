class Solution {
public:
    int maxArea(vector<int>& h) {
        
        int ans = 0, l = 0, r = h.size()-1, area = 0;
        while (l < r) {
            
            if (h[l] <= h[r]) {
                area = h[l] * (r - l);
                l++;
            }
            else {
                area = h[r] * (r - l);
                r--;
            }
            
            ans = max(ans, area);
        }
        return ans;
    }
};