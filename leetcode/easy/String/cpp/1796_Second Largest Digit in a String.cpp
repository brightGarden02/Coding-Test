class Solution {
public:
    int secondHighest(string s) {
        
        vector<int> v;
        for(int i = 0; i < s.length(); i++){
            
            if(isdigit(s[i])){
                int tmp = (int)(s[i] - '0');
                v.push_back(tmp);
            }
        }
        
        int maxInt = INT_MIN;
        int secondMaxInt = INT_MIN;
        for(int i : v){
            
            if(i > maxInt){
                secondMaxInt = maxInt;
                maxInt = i;
            }
            else if(i != maxInt && i > secondMaxInt){
                secondMaxInt = i;
            }
        }
        
        if(secondMaxInt == INT_MIN) return -1;
        
        return secondMaxInt;
    }
};