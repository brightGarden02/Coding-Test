class Solution {
public:
    int countTriples(int n) {
        
        int ans = 0;
        for(int a = 1; a <= n; a++){
            for(int b = a+1; b <= n; b++){
                
                int c = sqrt(a*a + b*b);
                if(c*c == a*a + b*b && c > b && c <= n)
                    ans = ans + 2;
            }
            
        }
        return ans;
    }
};