class Solution {
public:
    int maxRepeating(string sequence, string word) {
        
        int count = 0;
        string pattern = word;
        
        while(sequence.find(pattern) != string::npos) {
            count++;
            pattern += word;
        }
        
        return count;
    }
};