class Solution {
public:
    int wateringPlants(vector<int>& plants, int c) {
        
        int steps = 0;
        int i = 0;
        int tmpc = c;
        while(i < plants.size()){
            
            if(tmpc < plants[i]){
                steps = steps + 2*i +1;
                tmpc = c;
                tmpc = tmpc - plants[i];
            }
            else{
                tmpc = tmpc - plants[i];
                steps++;
            }
            i++;
        }
        
        return steps;
    }
};