class Solution {
public:
    bool isSameAfterReversals(int num) {
        
        if(num == 0) return true;
        string numStr = to_string(num);
        
        string str1 = reverseNumber(num);
        num = stoi(str1);
        string str2 = reverseNumber(num);
        
        return numStr == str2;
    }
    
    string reverseNumber(int num){
        
        string str = "";
        while(num){
            int res = num % 10;
            str += to_string(res);
            num = num / 10;
        }
        return str;
    }
};
