class Solution {
    public int[] diStringMatch(String s) {
        
        int n = s.length();
        int[] arr = new int[n+1];
        for(int i = 0; i < n+1; i++){
            arr[i] = i;
        }
        
        int l = 0;
        int r = n;
        int[] result = new int[n+1];
        for(int i = 0; i < n; i++){
            
            if(s.charAt(i) == 'I'){
                
                result[i] = arr[l];
                l++;
            }
            else{
                result[i] = arr[r];
                r--;
            }
        }
            
        result[n] = arr[r];
            
        return result;
    }
}
