class Solution {
public:
    int isPrefixOfWord(string sentence, string searchWord) {
        
        int i = 1;
        int len = searchWord.length();
        
        stringstream ss(sentence);
        string word;
        while(ss >> word){
            
            string tmp = word.substr(0, len);
            
            if(tmp.find(searchWord) != std::string::npos){
                return i;
            }
            
            i++;
        }
        
        return -1;
    }
};
