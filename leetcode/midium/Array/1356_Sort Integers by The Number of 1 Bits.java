import java.util.Map.Entry;
class Solution {
    public int[] sortByBits(int[] arr) {
        
        Map<Integer, ArrayList<Integer>> map = new TreeMap<>();
        for(int i : arr){
            
            String temp = Integer.toBinaryString(i); 
            int count = 0;
            for(char j : temp.toCharArray()){
                if(j == '1'){
                    count++;
                }
            }
            map.putIfAbsent(count, new ArrayList<>());
            map.get(count).add(i);
        }
        
        
        int[] ans = new int[arr.length];
        
        int k = 0;
		for (int i : map.keySet())
		{
            ArrayList<Integer> temp = map.get(i);
            Collections.sort(temp);
            
            for(int j : temp){
                ans[k] = j;
                k++;
            }
		}
        
        return ans;
    }
}