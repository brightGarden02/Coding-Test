class Solution {
public:
    bool canFormArray(vector<int>& arr, vector<vector<int>>& pieces) {
        
        set<vector<int>> set;
        for(auto &it : pieces){
            set.insert(it);
        }
        
        vector<int> v;
        for(int i = 0; i < arr.size(); i++){
            
            v.push_back(arr[i]);
            if(set.count(v)){
                v.clear();
            }
            
        }
        return v.size() == 0;
    }
};