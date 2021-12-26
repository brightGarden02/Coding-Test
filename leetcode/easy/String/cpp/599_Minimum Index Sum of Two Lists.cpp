class Solution {
public:
    vector<string> findRestaurant(vector<string>& list1, vector<string>& list2) {
        
        unordered_map<string, int> map;
        
        for(int i = 0; i < list1.size(); i++){

            map[list1[i]] = i+1;
        }
        
        vector<string> ans;
        int minIndex = INT_MAX;
        int sumIndex = 0;
        for(int i = 0; i < list2.size(); i++){
            
            if(map[list2[i]] > 0){
                
                sumIndex = map[list2[i]] - 1 + i;
                
                if(sumIndex < minIndex){
                    minIndex = sumIndex;
                    ans.clear();
                    ans.push_back(list2[i]);
                }
                else if(sumIndex == minIndex){
                    ans.push_back(list2[i]);
                }
            }
        }
        
        return ans;  
    }
};