class Solution {
public:
    typedef pair<int, pair<int, int>> pii;
    
    vector<vector<int>> kSmallestPairs(vector<int>& nums1, vector<int>& nums2, int k) {
        
        priority_queue<pii, vector<pii>, greater<pii>> pq;
        vector<vector<int>> ans;
        set<pair<int, int>> myset;
        
        pq.push({nums1[0]+nums2[0], {0, 0}});
        myset.insert({0,0});
        
        int flag = 1;
        for(int cnt = 0; cnt < k and flag; cnt++){

            pii temp = pq.top();
            pq.pop();
            int i = temp.second.first;
            int j = temp.second.second;

            ans.push_back({nums1[i], nums2[j]});
            
            flag = 0;
            if(i+1 < nums1.size()){
                int sum = nums1[i+1] + nums2[j];
                
                pair<int, int> tempPair = {i+1, j};
                if(myset.find(tempPair) == myset.end()){
                    pq.push({sum, tempPair});
                    myset.insert({tempPair});
                }
                flag = 1;
            }
            
            if(j+1 < nums2.size()){
                int sum = nums1[i] + nums2[j+1];
                pair<int, int> tempPair = {i, j+1};
                if(myset.find(tempPair) == myset.end()){
                    pq.push({sum, tempPair});
                    myset.insert({tempPair});
                }
                flag = 1;
            }
            
        }
                
        return ans;
    }
};