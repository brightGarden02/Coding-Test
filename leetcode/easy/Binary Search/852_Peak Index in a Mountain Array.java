class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int peakIdx = 0;
        int peak = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > peak){
                peakIdx = i;
                peak = arr[i];
            }
                
        }
        
        return peakIdx;
    }
}