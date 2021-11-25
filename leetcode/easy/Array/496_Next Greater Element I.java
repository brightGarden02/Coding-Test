class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int length = nums1.length;
        int[] answer = new int[length];
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i = 0; i < nums2.length; i++){
            hm.put(nums2[i], i);
        }
        
        for(int i = 0; i < length; i++){
            answer[i] = getMax(nums2, hm.get(nums1[i]));
        }
        return answer;
    }
    
    
    public int getMax(int[] nums2, int index){
        
        int currMax = nums2[index];
        for(int i = index; i < nums2.length; i++){
            if(currMax < nums2[i]){
                return nums2[i];
            }
        }
        return -1;
    }
}