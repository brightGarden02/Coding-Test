class Solution {
public:
    bool isBoomerang(vector<vector<int>>& points) {
     
        if(points[0] == points[1] || points[0] == points[2] || points[1] == points[2]) {
            return false;
        }
        
        int x1 = points[0][0];
        int y1 = points[0][1];
        
        int x2 = points[1][0];
        int y2 = points[1][1];
        
        int x3 = points[2][0];
        int y3 = points[2][1];
        
        int difX21 = x2 - x1;
        int difY21 = y2 - y1;
               
        int difX31 = x3 - x1;
        int difY31 = y3 - y1;
        
        return difX21 * difY31 != difX31 * difY21;
    }
};