class Solution {
public:
    vector<vector<int>> insert(vector<vector<int>>& intervals, vector<int>& newInterval) {
        
        vector<vector<int>> ans;
        
        for(int i = 0; i < intervals.size(); i++){
            
            int starti = intervals[i][0];
            int endi = intervals[i][1];
            
			if(endi < newInterval[0]){
                
                ans.push_back(intervals[i]);
            }
            
			else if(starti > newInterval[1]){
                
                ans.push_back(newInterval);
                newInterval = intervals[i]; 
            }
            
            else if(starti <= newInterval[1] || newInterval[0] <= endi){
                
                newInterval[0] = min(newInterval[0], starti);
                newInterval[1] = max(newInterval[1], endi);

            }
        }
        ans.push_back(newInterval); 
        
        return ans;
    }
};