class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        return findPeak(0, arr.length-1, arr);
    }
    
    public int findPeak(int start, int end, int[] arr){
        
        while(start < end){
            
            int mid = start + (end - start)/2;
            int target = arr[mid+1];
            if(arr[mid] < target){
                start = mid+1;
            }
            else if(arr[mid] > target){
                end = mid;
            }
        }
        
        return end;
    }
}