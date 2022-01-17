class Solution {
public:
    vector<int> dailyTemperatures(vector<int>& t) {
        
        int n = t.size();
	    stack<int> s;
	    vector<int> ans(n, 0);
	    for (int i = 0; i < n; i++) {
		    while (!s.empty() && t[s.top()] < t[i]) {
                int j = s.top();
                s.pop();
                ans[j] = i - j;
		    }
		    s.push(i);
	    }
	    return ans;
    }
};