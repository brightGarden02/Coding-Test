class Solution {
public:
    string makeGood(string s) {
        
        string ans;
        for(char &c : s){
            
            ans.empty() || !isTwoAdjacent(ans.back(), c) ? 
                ans.push_back(c) : ans.pop_back();
            
        }
        
        return ans;
    }
    
    private:
        bool isTwoAdjacent(char &c1, char &c2){
            return (c1-32 == c2 || c1+32 == c2);
        }
    
};