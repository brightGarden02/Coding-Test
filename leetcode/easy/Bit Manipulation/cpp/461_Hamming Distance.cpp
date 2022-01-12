class Solution {
public:
    int hammingDistance(int x, int y) {
        
        string bx = to_binary(x);
        string by = to_binary(y);
        
        int len = max(bx.size(), by.size());
        while(bx.size() != len){
            bx = "0"  + bx; 
        }
        while(by.size() != len){
            by = "0"  + by;
        }
        
        int ans = 0;
        for(int i = 0; i < len; i++){
            if(bx[i] != by[i]) ans++;
        }
        
        return ans;
    }
    
    string to_binary(int num){
        
        string s = "";
        while(num){
            
            int rem = num%2;
            s = to_string(rem) + s;
            num = num/2;
        }
        
        return s;
    }
};
