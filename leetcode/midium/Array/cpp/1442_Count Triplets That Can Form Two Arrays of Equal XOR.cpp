class Solution {
public:
    int countTriplets(vector<int>& arr) {
        
		int n = arr.size();
		if(n == 0) return 0;
	    int a_with_b[n];
		int count=0;
        
		a_with_b[0] = arr[0];
		for(int i = 1; i < n; i++){
            a_with_b[i] = a_with_b[i-1] ^ arr[i];
        }
			
        
        for(int i = 0; i < n; i++){
			if(a_with_b[i] == 0) count += i;
		}
        
		for(int i = 0; i < n; i++){
			for(int j = i+1; j < n; j++){
				if(a_with_b[i] == a_with_b[j])
					count += j-(i+1);
			}
		}
        
		return count;
	}
};