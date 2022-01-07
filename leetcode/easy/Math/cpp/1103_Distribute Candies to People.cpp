class Solution {
public:
    vector<int> distributeCandies(int candies, int num_people) {
        
        vector<int> ans(num_people);
        
        int i = 1;
        int p = 0;
        while(candies > 0){
            
            if(i > candies) ans[p] += candies;
            else ans[p] += i;
            
            candies = candies - i;
            i++;
            p++;
            
            if(p == num_people) p = 0;   
        }
        
        return ans;
    }
};
