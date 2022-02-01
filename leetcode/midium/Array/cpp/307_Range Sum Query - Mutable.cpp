class NumArray {
private:
    vector<int> bit;
    int n;
    int lsb(int idx){
        
        return idx & (-idx);
    }

    void bitUpdate(int node_index, int val){
        
        while(node_index <= n){
            
            bit[node_index] += val;
            node_index += lsb(node_index);
        }
    }

    void createBit(vector<int> &nums){
        
        for(int i = 0; i < n; i++){
            
            bitUpdate(i+1, nums[i]);
        }
    }

    int sumQuery(int idx){
        
        int sum = 0;
        while(idx >= 1){
            
            sum += bit[idx];
            idx -= lsb(idx);
        }
        
        return sum;
    }

public:
    vector<int> nums;
    NumArray(vector<int>& nums) {
        
        this->nums = nums;
        bit.clear();
        n = nums.size();
        bit.resize(n+1);
        createBit(nums);   
    }
    
    void update(int index, int val) {
        
        int diff = val - nums[index];
        nums[index] = val;
        bitUpdate(index+1,diff);
    }
    
    int sumRange(int left, int right) {
        
        return sumQuery(right+1) - sumQuery(left);
    }
};