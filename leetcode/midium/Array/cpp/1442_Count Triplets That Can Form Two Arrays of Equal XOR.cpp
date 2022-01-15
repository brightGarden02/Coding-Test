class Solution {
public:
    int countTriplets(vector<int>& arr) {
        
	int n = arr.size();
	if(n == 0) return 0;
	int two_value_arrays[n];
	int count = 0;
        
	two_value_arrays[0] = arr[0];
	for(int i = 1; i < n; i++){
        	two_value_arrays[i] = two_value_arrays[i-1] ^ arr[i];
    	}
			
        
    	for(int i = 0; i < n; i++){
		if(two_value_arrays[i] == 0) count += i;
	}
        
	for(int i = 0; i < n; i++){
		for(int j = i+1; j < n; j++){
			if(two_value_arrays[i] == two_value_arrays[j])
				count += j-(i+1);
		}
	}
        
	return count;
	}
};
