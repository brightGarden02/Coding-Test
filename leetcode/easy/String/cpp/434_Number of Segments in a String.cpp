class Solution {
public:
    int countSegments(string s) {
       
        s = s + " ";
        int wordCounts = 0; int charCounts = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s[i] == ' ')
            {
                if(charCounts != 0) wordCounts++;
                charCounts = 0;
            }
            else            
                charCounts++;
        }
        return wordCounts;
    }
};