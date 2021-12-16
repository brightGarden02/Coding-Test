class Solution {
    public boolean areNumbersAscending(String s) {
        
        String[] array = s.split(" ");
        
        ArrayList<Integer> al = new ArrayList<>();
        int tmp = 0;
        for(String str : array){
            
            boolean isDigit = str.matches("^[0-9]*$");
            if(isDigit){
                tmp = Integer.parseInt(str);
                al.add(tmp);
            }
        }
        
        for(int i = 0; i < al.size()-1; i++){
            
            if(al.get(i) >= al.get(i+1)) return false;
            
        }
        
        return true;
    }
}