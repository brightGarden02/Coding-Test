class Solution {
public:
    bool isPathCrossing(string path) {
        
        set<pair<int, int>> map;
        int x = 0, y = 0;
        map.insert({x, y});
        
        for(int i = 0; i < path.length(); i++){
            
            if(path[i] == 'N') y++;
            else if(path[i] == 'S') y--;
            else if(path[i] == 'E') x++;
            else if(path[i] == 'W') x--;
            
            if(map.find({x, y}) != map.end()) return true;
            else map.insert({x, y});
        }
        
        return false;
    }
};