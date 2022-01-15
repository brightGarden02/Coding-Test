class Solution {
public:
    int findTheWinner(int n, int k) {
        vector<int> circle;       
        
        for(int i = 1; i <= n; i++)
            circle.push_back(i);
        
         int i = 0;           
         while(circle.size() != 1){
             
             int circle_size = circle.size();       
             i = (i+k-1) % circle_size;  
             
             circle.erase(circle.begin() + i);
         }
        
         return circle[0]; 
    }
};