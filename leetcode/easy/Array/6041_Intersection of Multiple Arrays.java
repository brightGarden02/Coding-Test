class Solution {

    public List<Integer> intersection(int[][] nums) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
          
          for(int j = 0; j < nums[i].length; j++){
              if(!hm.containsKey(nums[i][j])){
                  hm.put(nums[i][j], 1);
                }

              else{
                  hm.put(nums[i][j], hm.getOrDefault(nums[i][j], 0) + 1);
                }
          }

        List<Integer> list = new ArrayList<>();

        for(int key : hm.keySet()){

            if(hm.get(key) == nums.length){

                list.add(key);

            }

        }

        Collections.sort(list);

        return list;

    }

}​
