class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long m = money;
        for(int i = 1; i <= count; i++){
            answer += price*i;
        }
        m -= answer;
        if(m > 0)
            return 0;
        
        return -m;
    }
}