class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        if(bills[0] > 5) return false;
        int coin5 = 0;
        int coin10 = 0;
        
        for(int i = 0; i < bills.length; i++){
            if(bills[i] == 5){
                coin5++;
            }    
            else{
                if(bills[i] == 10){
                    if(coin5 == 0) return false;
                    coin5--;
                    coin10++;
                }
                else{
                    
                    if(coin5 > 0 && coin10 > 0){
                        coin5--;
                        coin10--;
                    }
                    else if(coin5 > 2){
                        coin5 = coin5 - 3;
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        
        return true;
    }
}