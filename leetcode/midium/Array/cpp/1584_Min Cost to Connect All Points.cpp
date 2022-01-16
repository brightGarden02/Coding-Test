class Solution {
public:
    // track parent node of the nodes
    int parents[1001];
    
    int minCostConnectPoints(vector<vector<int>>& points) {
                
        int n = points.size();
        
        // create Min Heap to store all edges and costs |xi - xj| + |yi - yj|
        // priority based on min edge cost
        priority_queue<array<int, 3>, vector<array<int, 3>>, greater<>> pq;        
        array<int, 3> t;        
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                
                int x_diff = abs(points[i][0] - points[j][0]);
                int y_diff = abs(points[i][1] - points[j][1]);
                
                t[0] = x_diff + y_diff;
                t[1] = i;
                t[2] = j;
                pq.push(t);
            }
        }
        
        // initialize all nodes parents and every node is their own parent 
        for(int i = 0; i < n; i++){
            parents[i] = i;    
        } 
                
        // minimum spanning tree cost
        int cost = 0;
        
        // unify node count
        int unify_c = 0;
        int x, y, c;
        
        // loop through min to max cost edges by popping edge from Min Heap and then unify if possible
        // if we can unify the edge then we will update the cost with edge cost 
        while(!pq.empty()){
            
            t = pq.top();            
            pq.pop();
            
            if(unite(t[1], t[2])){
                
                cost += t[0];
                unify_c++;
                
                // break loop as soon as we unify all nodes
                if(unify_c == n-1) break;
            }
        }
        
        return cost;
    }
    
    // find the parent of the node and also do path compression
    int find(int t){
        
        if(parents[t] == t) return t;
        
        return parents[t] = find(parents[t]);
    }
    
    // return true if edge nodes can be unified and only when they have different parents
    bool unite(int t1, int t2){
        
        int p1 = find(t1);
        int p2 = find(t2);
        
        if(p1 == p2) return false;
        
        // make min parent node as parent of max parent node 
        parents[max(p1, p2)] = parents[min(p1, p2)];
        return true;
    }
};