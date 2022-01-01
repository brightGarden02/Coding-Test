class Solution {
public:
    vector<string> findRelativeRanks(vector<int>& score) {
        
        priority_queue<pair<int, int>> pq;
        vector<string> ans(score.size());
        
        for(int i = 0; i < score.size(); i++){
            pq.push({score[i], i});
        }
        
        for(int i = 0; i < score.size(); i++){
            
            auto it = pq.top();
            pq.pop();
            if(i == 0){
                ans[it.second] = "Gold Medal";
            }
            else if(i == 1){
                ans[it.second] = "Silver Medal";
            }
            else if(i == 2){
                ans[it.second] = "Bronze Medal";
            }
            else{
                ans[it.second] = to_string(i+1);
            }
             
        }
        
        return ans;
    }
};