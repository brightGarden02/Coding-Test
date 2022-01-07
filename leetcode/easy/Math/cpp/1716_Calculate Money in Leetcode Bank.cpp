class Solution {
public:
    int totalMoney(int n) {
        
        int ans = 0;
        int start = 1;
        int j = 1;
        for(int i = 1; i <= n; i++){
            
            ans = ans + start;
            start++;
            
            if(i%7 == 0){
                j++;
                start = j;
            }
        }
        return ans;
    }
};
