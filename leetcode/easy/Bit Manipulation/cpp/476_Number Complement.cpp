class Solution {
public:
    int findComplement(int num) {
        
        string s = to_binary(num);
        s = complement(s);
        
        return stoi(s, 0, 2);
    }
    
    string to_binary(int num){
        
        string s = "";
        while(num){
            int rem = num%2;
            s = to_string(rem) + s;
            num = num/2;
        }
        return s;
    }
    
    string complement(string s){
        
        for(int i = 0; i < s.size(); i++){
            if(s[i] == '1')
                s[i] = '0';
            else
                s[i] = '1'; 
        }
        return s;
    }
};