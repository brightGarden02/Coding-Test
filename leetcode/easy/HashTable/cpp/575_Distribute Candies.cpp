class Solution {
public:
    int distributeCandies(vector<int>& candyType) {
        
        unordered_set<int> set;
        int n = candyType.size();
        
        for(int i = 0; i < n; i++){
            set.insert(candyType[i]);
        }
        
        if(n/2 < set.size()) return n/2;
        
        return set.size();  
    }
};