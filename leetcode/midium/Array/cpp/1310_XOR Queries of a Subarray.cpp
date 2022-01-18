class Solution {
public:
    vector<int> xorQueries(vector<int>& prefix, vector<vector<int>>& queries) {
        
        vector<int> ans;
        for(int i = 1; i < prefix.size(); i++){
            prefix[i] = prefix[i-1] ^ prefix[i];
        }
        
        for(int i = 0; i < queries.size(); i++){
            
            vector<int> tmp = queries[i];
            int l = tmp[0];
            int r = tmp[1];
            
            if(l == 0){
                ans.push_back(prefix[r]);
            }
            else{
                ans.push_back(prefix[l-1] ^ prefix[r]);
            }
        }
        
        return ans;
    }
};