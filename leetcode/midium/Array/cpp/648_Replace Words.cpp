class Solution {
public:
    string replaceWords(vector<string>& dictionary, string sentence) {
        
        unordered_set<string> dict;
        for(string s : dictionary){
            dict.insert(s);
        }

        string ans = "", curr = "";
        bool skip = false;
        for(int i = 0; i <= sentence.length(); i++){

            if(sentence[i] == ' ' || i == sentence.length()){

                ans += curr;
                if(i != sentence.length()){
                    ans += " ";
                }
                curr = "";
                skip = false;
            }            
            else if(skip == false){

                curr += sentence[i];
                if(dict.find(curr) != dict.end()){
                    skip = true;
                }
            }

        }

        return ans;
    }
};