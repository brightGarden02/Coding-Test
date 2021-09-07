class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        boolean check = false;
        int number = 0;
        
        for(int i = 0; i < nums.length-2; i++){
            for(int j = i+1; j < nums.length-1; j++){
                for(int k = j+1; k < nums.length; k++){
                    
                    number = nums[i] + nums[j] + nums[k];
                    check = isPrime(number);
                    if(check == true){
                        answer++;
                    }
                }
            }
        }
        
        
        return answer;
    }
    
    
    public boolean isPrime(int number){
        for(int i = 2; i < number; i++){
            if(number%i == 0){
                // System.out.println("소수가 아닙니다.");
                return false;
            }
        }
        // System.out.println("소수 입니다.");
        return true;
    }
    
}