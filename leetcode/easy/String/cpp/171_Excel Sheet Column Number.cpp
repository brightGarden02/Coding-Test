class Solution {
public:
    int titleToNumber(string columnTitle) {
        
        int sum = 0;
        int tmp = 0;
        int n = columnTitle.size()-1;
        int i = 0;
        while(n >= 0){
            
            tmp = (columnTitle[i] - 'A' + 1) * pow(26, n);
            sum += tmp;
            n--;
            i++;
            
        }   
        
        return sum;    
    }
};