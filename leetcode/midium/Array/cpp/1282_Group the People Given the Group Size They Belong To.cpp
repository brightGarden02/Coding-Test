class Solution {
public:
    vector<vector<int>> groupThePeople(vector<int>& groupSizes) {
        
        int n = groupSizes.size();
        unordered_map<int, vector<int>> map;
        
        for(int i = 0; i < n; i++){
            
            int group_size = groupSizes[i];
            map[group_size].push_back(i);
        }
        
        vector<vector<int>> ans;
        for(auto m : map){
            
            int size = m.first;
            vector<int> v = m.second;
            vector<int> group;
            
            for(int j = 0; j < v.size(); j++){
                
                group.push_back(v[j]);
                if((j+1) % size == 0){
                    
                    ans.push_back(group);
                    group.clear();
                }
            }
        }
        
        return ans;
    }
};
