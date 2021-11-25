class Solution {
    public String[] findWords(String[] words) {
        
        String s1 = "QWERTYUIOPqwertyuiop";
        String s2 = "ASDFGHJKLasdfghjkl";
        String s3 = "ZXCVBNMzxcvbnm";
        
        ArrayList<String> al = new ArrayList<>();
        
        for(String s : words){
            char[] charArray = s.toCharArray();
            int c1 = 0;
            int c2 = 0;
            int c3 = 0;
            
            for(Character c : charArray){
                if(s1.contains(Character.toString(c))){
                    c1++;
                }
                else if(s2.contains(Character.toString(c))){
                    c2++;
                }
                else{
                    c3++;
                }
            }
            if(c1 != 0 && c2 == 0 && c3 == 0){
                al.add(s);
            }
            if(c1 == 0 && c2 != 0 && c3 == 0){
                al.add(s);
            }
            if(c1 == 0 && c2 == 0 && c3 != 0){
                al.add(s);
            }            
        }
        
        String[] answer = new String[al.size()];
        answer = al.toArray(answer);
        
        return answer;
    }
}