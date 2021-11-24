class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++){
            
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        
        }
        System.out.println(map);
        
        Set<Integer> set = new HashSet<>();
        
	    for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            
		    if(set.add(entry.getValue())){
			    continue;
		    }
		    else{
			    return false;
		    }
            
	    }
            
        return true;
    }
}