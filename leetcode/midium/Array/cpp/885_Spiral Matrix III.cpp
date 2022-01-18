class Solution {
public:
    vector<vector<int>> spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        
        vector<vector<int>> ans;
        
        vector<int> cur = {rStart, cStart};
        ans.push_back(cur);
        
        int directions[] = {0, 1, 0, -1, 0};
        int len = 0;
        int d = 0;
        int i = 1;
        while(i < rows*cols){
            if(d == 0 || d == 2){
                len++;
            }
            
            for(int k = 0; k < len; k++){
                
                rStart += directions[d];
                cStart += directions[d+1];
                if(rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols){
                    vector<int> cur = {rStart, cStart};
                    ans.push_back(cur);
                    i++;
                }
            }
            d++;
            d = d%4;
        }
        
        return ans;
    }
};