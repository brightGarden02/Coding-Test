class Solution {
public:
    int daysBetweenDates(string date1, string date2) {
        
        return abs(calculateDays(date1) - calculateDays(date2));
    }
    
    int calculateDays(string s){
        
        int year = stoi(s.substr(0, 4));
        int month = stoi(s.substr(5, 2));
        int days = stoi(s.substr(8, 2));
        
        int total_days = 0;
        for(int i = 1971; i < year; i++){
            total_days += isLeap(i) ? 366 : 365;
        }
        for(int i = 1; i < month; i++){
            total_days += daysInMonth(i, year);
        }
        
        return total_days + days;
    }
    
    int isLeap(int year){
        if(year % 4 == 0){
            if(year % 400 == 0 || year % 100 != 0){
                return true;
            }
        }
        return false;
    }
    
    
    int daysInMonth(int month, int year){
        
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 ||
          month == 10 || month == 12){
            return 31;
        }
        else if(month == 2)
            return isLeap(year) ? 29 : 28;
        return 30;
    }
};