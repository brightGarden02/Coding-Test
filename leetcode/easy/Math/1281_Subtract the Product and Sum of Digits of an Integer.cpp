class Solution {
public:
    int subtractProductAndSum(int n) {
        
        int prod = 1;
        int sum = 0;
        while(n){
            
            int tmp = n%10;
            prod = prod * tmp;
            sum = sum + tmp;
            
            n = n/10;
            
        }
        
        return prod - sum;
    }
};