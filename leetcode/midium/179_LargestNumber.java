class Solution {
    public String largestNumber(int[] nums) {
        
        StringBuilder ans = new StringBuilder();
        int n = nums.length;
		if (n == 0){
            return null;
        } 
        
        
        String[] sArr = new String[n];
        for (int i = 0; i < n; i++){
            sArr[i] = Integer.toString(nums[i]);
        }
            
            
        Comparator<String> comp = new Comparator<>(){
            
            @Override
            public int compare(String o1, String o2){
                
                return (o1+o2).compareTo(o2+o1);
                
            }
        };
        
         Arrays.sort(sArr, comp);
         
        if (sArr[n-1].equals("0")){
            return "0";
        } 
            
       
        for (int i = n-1; i >= 0; i--){
            
        	 ans.append(sArr[i]);
         }
        
        return ans.toString();
    }
}
