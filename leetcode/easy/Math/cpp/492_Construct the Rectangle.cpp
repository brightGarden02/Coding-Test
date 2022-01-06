class Solution {
public:
    vector<int> constructRectangle(int area) {
        
        vector<int> v;
        int minL;
        int minW;
        
        int minDiff = INT_MAX;
        for(int W = 1; W <= sqrt(area); W++){
            
            int L = area / W;
            if(L * W == area){
                
                auto diff = abs(L-W);
                if(diff < minDiff){
                    
                    minDiff = diff;
                    minL = L;
                    minW = W;
                }
            }
        }
        
        v.push_back(max(minL, minW));
        v.push_back(min(minL, minW));
         
        return v;
    }
};