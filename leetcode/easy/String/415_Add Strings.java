class Solution {
    public String addStrings(String num1, String num2) {
     
        StringBuilder sb = new StringBuilder();
        int c1 = num1.length()-1;
        int c2 = num2.length()-1;
        int sum = 0;
        
        while(c1 >= 0 || c2 >= 0){
            if(c1 >= 0 && c2 >= 0){
                sum += num1.charAt(c1) + num2.charAt(c2) - 96;
            }
            else if(c1 >= 0){
                sum += num1.charAt(c1) - 48;
            }
            else{
                sum += num2.charAt(c2) - 48;
            }
            sb.append(sum % 10);
            sum /= 10;
            c1--;
            c2--;
        }
 
        if(sum != 0) sb.append(sum);
        
        return sb.reverse().toString();
    }
}
