class Solution {
public:
    int binaryGap(int n) {
        
        string binaryN = toBinary(n);
        bool flag1 = false;
        bool flag2 = false;
        int j = 0;
        int dMax = 0;
        
        for(int i = 0; i < binaryN.length(); i++){
            
            if(binaryN[i] == '1'){
                
                flag1 = true;
                if(flag1 && (i+1 < binaryN.length())){
                    j = i+1;
                    while(j < binaryN.length()){
                        
                        if(binaryN[j] == '1'){
                            flag2 = true;
                            break;
                        }
                        else{
                            flag2 = false;
                        }
                        j++;
                    }
                }     
            }
            if(flag2){
                dMax = max(j-i, dMax);
            } 
        }
           
        return dMax;
    }
    
    
    string toBinary(int n){
        
        string ans = "";
        while(n){
            
            int rem = n%2;
            ans = to_string(rem) + ans;
            n = n/2;
        }
        return ans;
    }
};