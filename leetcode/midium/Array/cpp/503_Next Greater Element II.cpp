class Solution {
public:
    vector<int> nextGreaterElements(vector<int>& nums) {
        
        vector<int> v;
        int max_element = INT_MIN;
        for(int i = 0; i < nums.size(); i++){
            max_element = max(max_element, nums[i]);
        }
        
        for(int i = 0; i < nums.size(); i++){
            if(nums[i] == max_element){
                v.push_back(-1);
            } 
            else{
                int element = findNextGreaterElements(nums, i);
                v.push_back(element);    
            }
            
        }
        
        return v;
    }
    
    int findNextGreaterElements(vector<int>& nums, int i){
        
        int j = i+1;
        int next_greater_element = INT_MIN;
        
        if(i == nums.size()-1) j = 0;
        while(j < nums.size()){
            
            if(nums[i] < nums[j]){
                next_greater_element = nums[j];
                break;
            }
            
            j++;
        }
        if(next_greater_element != INT_MIN) return next_greater_element;
        else{
            
            for(int k = 0; k < i; k++){
                if(nums[i] < nums[k]){
                    next_greater_element = nums[k];
                    break;
                }
            }
            return next_greater_element;
        }
        
    }
};