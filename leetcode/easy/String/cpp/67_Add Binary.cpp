class Solution {
public:
    string addBinary(string a, string b) {
        
        int aLen = a.length()-1;
        int bLen = b.length()-1;
        int carry = 0;
        string ans;    
        while(aLen >= 0 || bLen >= 0){
        
            int sum = 0;
            if(aLen >= 0 && bLen >= 0){
                sum = (a[aLen] - '0') + (b[bLen] - '0') + carry;
                aLen--;
                bLen--;
            }
            else if(aLen >= 0){
                sum = (a[aLen] - '0') + carry;
                aLen--;
            }
            else{
                sum = (b[bLen] - '0') + carry;
                bLen--;
            }
            
            
            if(sum == 2){
                carry = 1;
                sum = 0;
            }
            else if(sum == 3){
                carry = 1;
                sum = 1;
            }
            else if(sum == 1){
                carry = 0;
                sum = 1;
            }
            ans = to_string(sum) + ans;
            
        }
        if(carry == 1){
            ans = to_string(carry) + ans;
        }
        
        return ans;
    }
};
