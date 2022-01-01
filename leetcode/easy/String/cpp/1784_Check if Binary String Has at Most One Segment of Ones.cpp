class Solution {
public:
    bool checkOnesSegment(string s) {
        
        int c = 0;
        vector<int> v;
        
        for(auto i : s){
            if(i == '1'){
                c++;
            }
            else{
                if(c > 0) v.push_back(c);
                c = 0;
            }
        }
        
        if(c > 0) v.push_back(c);
        
        return v.size() == 1;
    }
};