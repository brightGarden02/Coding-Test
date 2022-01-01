class Solution {
public:
    bool isHappy(int n) {
        
        unordered_map<int, int> map;
        int res;
        
        while(n != 1){
		
	    //check cycle
            if(map[n]) return false;
            map[n]++;
            
            res = 0;
	    while(n){
                res += pow(n%10, 2);
                n /= 10;
            }
            n = res;
        }
        
        return true;
    }
};
