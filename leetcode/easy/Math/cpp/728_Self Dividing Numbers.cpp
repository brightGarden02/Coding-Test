class Solution {
public:
    vector<int> selfDividingNumbers(int left, int right) {
        
        vector<int> v;
        for(int i = left; i <= right; i++){
            
            string tmpStr = to_string(i);
            int divZero = 0;
            int tmp = i;
            int j = 0;
            while(j < tmpStr.size()){
                
                int d = tmp%10;
                if(d != 0 && (i%d == 0)){
                    divZero++;
                }
                tmp = tmp/10;
                j++;
            }
            if(divZero == tmpStr.size()){
                v.push_back(i);
            }
        }
        
        return v;
    }
};
