class Solution {
public:
    int canCompleteCircuit(vector<int>& gas, vector<int>& cost) {
        
        int sumGas = accumulate(gas.begin(), gas.end(), 0);
        int sumCost = accumulate(cost.begin(), cost.end(), 0);
        if(sumGas < sumCost) return -1;
        
        int total = 0;
        int diff = 0;
        int start = 0;

        for(int i = 0; i < gas.size(); i++){
            diff = gas[i] - cost[i];
            total += diff;
            
            if(total < 0){
                start = i+1;
                total = 0;
            }
        }

        return start;
    }
};