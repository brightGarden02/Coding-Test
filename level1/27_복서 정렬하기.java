class Solution {
    public int[] solution(int[] weights, String[] head2head) {
        int[] answer = {};
        double[] winPercentArr = new double[head2head.length];
        
        for(int i = 0; i < head2head.length; i++){
            String str = head2head[i];
            int play = 0;
            double win = 0.0, lose = 0.0,  winPercent = 0.0;
            
            for(int j = 0; j < str.length(); j++){
                System.out.print(str.charAt(j) + " ");
                if(str.charAt(j) == 'W'){
                    win++;
                    play++;
                }
                else if(str.charAt(j) == 'L'){
                    lose++;
                    play++;
                }
            }
            if(play == 0){
                winPercentArr[i] = 0;
                // System.out.println("up W: " + win + ", L: " + lose + ", play: " + play);
            }
            else{
                winPercent = (win/play) * 100;
                winPercentArr[i] = winPercent; 
                // System.out.println("down W: " + win + ", L: " + lose + ", play: " + play + ", winPercent: " + winPercentArr[i]);
            }
            
            System.out.println();
        }
        
        for(double i : winPercentArr)
            System.out.print(i + " ");
        
        int[] arr1 = new int[winPercentArr.length];
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = i+1;
        }
        
        double tmp = 0.0;
        int tmpIndex = 0;
        for(int i = 0; i < winPercentArr.length-1; i++){
            
            double value = winPercentArr[i];
            for(int j = i+1; j < winPercentArr.length; j++){
                
                if(value < winPercentArr[j]){
                    tmp = winPercentArr[j];
                    winPercentArr[j] =  winPercentArr[i];
                    winPercentArr[i] = tmp;
                    
                    tmpIndex = arr1[j];
                    arr1[j] = arr1[i];
                    arr1[i] = tmpIndex;
                }
            }
        }
        
        System.out.println();
        for(int i = 0; i < winPercentArr.length; i++){
            System.out.print(winPercentArr[i] + " ");
        }
        
        System.out.println();
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        
        return answer;
    }
}