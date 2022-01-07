class Solution {
public:
    int numberOfSteps(int num) {
        
        int ans = 0;
        while(num){
            (num%2 == 0) ? (num = num/2) : (num = num-1);
            ans++;
        }
        
        return ans;
    }
};
