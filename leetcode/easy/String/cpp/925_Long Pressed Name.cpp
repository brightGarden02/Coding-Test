class Solution {
public:
    bool isLongPressedName(string name, string typed) {
        
        if(name[0] != typed[0]) return false;
        
        int i = 0, j = 0;
        while(i < name.length() && j < typed.length()){
            
            if(name[i] == typed[j]){
                i++;
                j++;
            }
            else if(typed[j] == typed[j - 1]){
                j++;
            }
            else return false;
        }
        
        if(i == name.length()){
            while(j != typed.length())
            {
                if(typed[j] != typed[j - 1]) 
                    return false;
                else
                    j++;
            }
            return true;
        }
        
        return false;
    }
};