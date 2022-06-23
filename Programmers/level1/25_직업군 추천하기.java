class Solution {
    public String solution(String[] table, String[] languages, int[] preference) {
        String answer = "";
        int score = 0, max = -1, tmpK = 0;
        
        for(int i = 0; i < table.length; i++){
            
            String str = table[i];
            String[] tmpArr = str.split(" ");
            String job = "";
            job = tmpArr[0];
            score = 0;
            
            for(int j = 0; j < languages.length; j++){
                
                for(int k = 1; k < tmpArr.length; k++){
                    
                    if(languages[j].equals(tmpArr[k])){
                        tmpK = 6 - k;
                        score = score + preference[j]*tmpK;
                    }
                }
                
            }
            if(max < score){
                max = score;
                answer = job;
            }
            else if(max == score){
                answer = compare(answer, job);
            }
        }
        
        return answer;
    }
    
    public String compare(String a, String b){
        if(a.charAt(0) > b.charAt(0)){
            return b;
        }
        else{
            return a;
        }
    }
    
}
