class Solution {
public:
    string firstPalindrome(vector<string>& words) {
        
        for(auto &word : words){
            
            bool isPal = true;
            int l = 0;
            int r = word.length()-1;
            while(l < r){
                
                if(word[l] == word[r]){
                    l++;
                    r--;
                }
                else{
                    isPal = false;
                    break;
                }
            }
            if(isPal){
                return word;
            }
            
        }
        return "";
        
    }
};