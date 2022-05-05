class Solution {
    public String removeDigit(String number, char digit) {
        
        int n = number.length();
        List<String> list = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            
            if(number.charAt(i) == digit){
               list.add(number.substring(0, i) + number.substring(i+1));
            }
        }
        Collections.sort(list);
        
        return list.get(list.size()-1);
    }
}
