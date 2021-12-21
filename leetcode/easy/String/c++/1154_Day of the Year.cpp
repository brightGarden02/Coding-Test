class Solution {
public:
    int dayOfYear(string date) {
        
        int ans = 0;
        
        int year = stoi(date.substr(0, 4));
        int month = stoi(date.substr(5, 2));
        int day = stoi(date.substr(8, 2));
        
        vector<int> month_days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        for(int i = 0; i < month-1; i++){
            ans += month_days[i];
        }
        
        ans += day;
        
        if(month > 2 && year % 4 == 0){
            if(year % 100 != 0 || year % 400 == 0){
                ans++;
            }
        }
        return ans;
        
    }
};