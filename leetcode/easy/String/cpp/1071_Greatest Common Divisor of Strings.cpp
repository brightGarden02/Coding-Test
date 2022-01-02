class Solution {
public:
    string gcdOfStrings(string str1, string str2) {
        
        return str1 + str2 == str2 + str1
            ? str1.substr(0, my_gcd(str1.size(), str2.size())) : "";
    }
    
    int my_gcd(int a, int b){
            
        if(b == 0) return a;
        return my_gcd(b, a % b);
            
    }
};
