class Solution {
public:
    string reformatDate(string date) {
        
        stringstream str(date);
        
        string tmp;
        string arr[3];
        int i = 0;
        while(str >> tmp){
            arr[i] = tmp;
            i++;
        }
        
        string ans = "";
        ans += arr[2];
        
        string month = month_conversion(arr[1]);
        ans += "-" + month;
        
        if(arr[0].length() == 3){
            arr[0] = arr[0].substr(0, 1);
            arr[0] = "0" + arr[0];
        }
        else{
            arr[0] = arr[0].substr(0, 2);
        }
        
        ans += "-" + arr[0];
        
        return ans;
    }
    
    
    string month_conversion(string month){
        
        if(month == "Jan") return "01";
        else if(month == "Feb") return "02";
        else if(month == "Mar") return "03";
        else if(month == "Apr") return "04";
        else if(month == "May") return "05";
        else if(month == "Jun") return "06";
        else if(month == "Jul") return "07";
        else if(month == "Aug") return "08";
        else if(month == "Sep") return "09";
        else if(month == "Oct") return "10";
        else if(month == "Nov") return "11";
        else return "12";
        
    }
};