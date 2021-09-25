class Solution {
   public int solution(int[] numbers, int target) { 
       
       int answer = dfs(numbers, 0, 0,target); 

       return answer; 
   } 

    public int dfs(int[] numbers, int index, int sum, int target){ 

        if(index == numbers.length){ 
            if(target == sum) 
                return 1;
            else 
                return 0; 
        } 
        else{ 
            return dfs(numbers, index + 1, sum + numbers[index], target) + dfs(numbers, index + 1, sum - numbers[index], target); 
        }
    }
}