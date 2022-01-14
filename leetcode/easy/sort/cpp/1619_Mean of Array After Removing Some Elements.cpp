class Solution {
public:
    double trimMean(vector<int>& arr) {
     
        sort(arr.begin(), arr.end());
        int n = arr.size();
        int fivePer = n*5/100;
        
        double sum = 0;
        int count = 0;
        for(int i = fivePer; i < n-fivePer; i++){
            sum += arr[i];
            count++;
        }
        
        return sum/count;
    }
};
