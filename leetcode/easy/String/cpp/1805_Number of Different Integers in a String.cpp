class Solution {
public:
    int numDifferentIntegers(string word) 
    {
        unordered_set<string> s;
        word += ' ';
        int n = word.length();
        
        int i = 0;
        while(i < n)
        {
            string num = "";
            if(!isdigit(word[i]))
            {
                i++;
                continue;
            }
            while(isdigit(word[i]))
            {
                num = word[i]+ num;
                i++;
            }
            if(num.length() != 0)
            {
                int j = num.length() - 1;
                
                while(num[j] == '0' && j > 0) 
                {
                    j--;
                }
                if(num.length() == 0) num = '0';
                string finalVal = num.substr(0, j+1);
                s.insert(finalVal);
            }
            i++;
        }
        
        return s.size();
    }
};