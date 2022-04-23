class Solution {
    public int convertTime(String current, String correct) {
        
        String[] currArr = current.split(":");
        String[] corrArr = correct.split(":");
        int curMin = Integer.parseInt(currArr[0]) * 60 + Integer.parseInt(currArr[1]);
        int corMin = Integer.parseInt(corrArr[0]) * 60 + Integer.parseInt(corrArr[1]);
        int diff = corMin - curMin;
        int count = 0;
        
        
        if(diff >= 60){
            
            count += diff / 60;
            diff = diff % 60;
        }
        if(diff >= 15){
            
            count += diff / 15;
            diff = diff % 15;
        }
        
        if(diff >= 5){
            
            count += diff / 5;
            diff = diff % 5;
        }
        
        if(diff >= 1){
            
            count += diff / 1;
            diff = diff % 1;
        }
        
        
    
        return count;
    }
}
