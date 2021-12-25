class Solution {
public:
    string reformat(string s) {
      
        string digit = "";
        string number = "";
        
        for(auto i : s){
            
            if(isdigit(i)){
                digit += i;
            }
            else{
                number += i;
            }
        }
        
        string ans = "";
        int numberLen = number.length();
        int digitLen = digit.length();
        if(abs(numberLen - digitLen) > 1)
        {
            return ans;
        }
        
        
        bool firstDigit = false;
        if(digitLen > numberLen) firstDigit = true;
        int l1 = 0, l2 = 0;
        
        if(firstDigit){
            while(l1 < digitLen || l2 < numberLen){

                if(l1 < digitLen){

                    ans += digit[l1];
                    l1++;
                }

                if(l2 < numberLen){

                    ans += number[l2];
                    l2++;
                }

            }   
        }
        else{
            while(l1 < digitLen || l2 < numberLen){

                if(l2 < numberLen){

                    ans += number[l2];
                    l2++;
                }
                
                if(l1 < digitLen){

                    ans += digit[l1];
                    l1++;
                }
            } 
        }
        
        
        return ans;
            
    }
};