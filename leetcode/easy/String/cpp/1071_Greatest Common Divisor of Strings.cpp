class Solution {
public:
    string gcdOfStrings(string str1, string str2) {
        
        int size1 = str1.size();
        int size2 = str2.size();
        
        return (str1 + str2 == str2 + str1)
            ? str1.substr(0, my_gcd(size1, size2)) : "";
    }
    
    int my_gcd(int a, int b){
            
        if(b == 0) return a;
        return my_gcd(b, a % b);
            
    }
};
