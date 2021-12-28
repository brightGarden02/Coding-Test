class Solution {
public:
    bool checkRecord(string s) {
        
        int absent = 0;
        int late = 0;
        int consecutive = 0;
        for(auto i : s){
            
            if(i == 'A'){
                absent++;
            }
            if(i == 'L'){
                consecutive++;
                late++;
            }
            else{
                consecutive = 0;
            }
            
            if(absent >= 2) return false;
            if(late >= 3 && consecutive >= 3) return false;
        }
        
        return true;
    }
};