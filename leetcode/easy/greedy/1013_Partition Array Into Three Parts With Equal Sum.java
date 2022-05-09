class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        
        int n = arr.length;
        int total = 0;
        
        for(int i = 0; i < n; i++){
            total += arr[i];
        }
        
        int quotient = total / 3;
        int remainer = total % 3;
        if(remainer != 0) return false;
        
        
        int tmp = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            
            tmp += arr[i];
            if(tmp == quotient){
                tmp = 0;
                count++;
            }
        }
    
        return count >= 3;
    }
}
