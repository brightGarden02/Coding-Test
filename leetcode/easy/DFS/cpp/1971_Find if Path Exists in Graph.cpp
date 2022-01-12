class Solution {
public:
    vector<vector<int>> graph;
    vector<bool> visited;
    bool validPath(int n, vector<vector<int>>& edges, int start, int end){
        
        graph.resize(n);
        visited.resize(n);
        for(auto &edge : edges){
            
            int u = edge[0];
            int v = edge[1];
            graph[u].push_back(v);
            graph[v].push_back(u);
        }
        
        return dfs(start, end);
    }
    
    bool dfs(int curr, int end){
        
        if(curr == end) return true;
        if(visited[curr]) return false;
        
        visited[curr] = true;
        for(int next : graph[curr]){
            
            if(dfs(next, end)) return true;
        } 
        
        return false;
    }
};
