class Solution {
public:
    vector<string> findOcurrences(string text, string first, string second) {
        
        vector<string> store;
        vector<string> ans;
        
        stringstream str(text);
        string word;
        while(str >> word){
            
            store.push_back(word);
        }
        
        
        for(int i = 0; i < store.size(); i++){
            
            if(store[i] == first && store[i+1] == second && i+2 < store.size()){
                ans.push_back(store[i+2]);
            }
            
        }
        
        return ans;
    }
};