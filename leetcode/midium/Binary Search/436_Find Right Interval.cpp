class Solution {
public:
    vector<int> findRightInterval(vector<vector<int>>& intervals) {
        
        vector<int> ans(intervals.size());
        map<int, int> m;
        
        for(int i = 0; i < intervals.size(); i++){
            m[intervals[i][0]] = i;                                          
        }
            
        for(int i = 0; i < intervals.size(); i++){
            if(m.lower_bound(intervals[i][1]) != end(m)){
                ans[i] = m.lower_bound(intervals[i][1]) -> second;
            }
            else{
                ans[i] = -1;
            }
        } 
          
        return ans;
    }
};
