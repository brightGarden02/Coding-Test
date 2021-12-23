class Solution {
public:
    bool makeEqual(vector<string>& words) {
        
        int array[26] = {0};
        for(string word : words){
            
            for(char c : word){
                int index = c - 'a';
                array[index]++;
            }
        }
        
        
        for(int i = 0; i < 26; i++){
            if(array[i] % words.size() != 0){
                return false;
            }
        }
        
        return true;
    }
};