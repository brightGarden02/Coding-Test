class Solution {
public:
    int countPrimeSetBits(int left, int right) {
        
        int ans = 0;
        for(int i = left; i <= right; i++){
            
            int ones = sum_numbers(i);
            bool prime = isPrime(ones);
            
            if(prime){
                ans++;
            } 
        }
        return ans;
    }

    int sum_numbers(int number){
        
        int ones = 0;
        while(number){
            
            int rem = number%2;
            if(rem == 1) ones++;
            number = number/2;
        }
        return ones;
    }
    
    bool isPrime(int number){
        
        if(number == 1) return false;
        
        for(int i = 2; i <= sqrt(number); i++){
            
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }
    
};