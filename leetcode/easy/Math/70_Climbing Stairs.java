class Solution {
    public int climbStairs(int n) {
        
        int one = 1, two = 1;
        for(int i = 1; i < n; i++){
            int tmp = one;
            one = one + two;
            two = tmp;
        }
        
        return one;
    }
}
