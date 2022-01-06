class Solution {
public:
    int addDigits(int num) {
        
        int ans = 0;
        if(to_string(num).size() == 1) return num;
        
        while(num){
            int rem = num % 10;
            ans += rem;
            num = num / 10;
        }
        num = ans;
        
        return addDigits(num);
    }
};
