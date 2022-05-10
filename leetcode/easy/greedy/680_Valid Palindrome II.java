class Solution {
    public boolean validPalindrome(String s) {

        int n = s.length();
        int l = 0, r = n-1;
        while(l < r){

            if(s.charAt(l) != s.charAt(r)){

                String newString = deleteChar(s, l);

                if(isPalindrome(newString)) return true;

                newString = deleteChar(s, r);

                return (isPalindrome(newString));
            }

            l++;
            r--;
        }

        return true;
    }

    private boolean isPalindrome(String newString) {

        int l = 0;
        int r = newString.length()-1;
        while(l < r){
            if(newString.charAt(l) != newString.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;

    }

    private String deleteChar(String s, int deleteIdx) {

        String newString = "";
        int n = s.length();
        newString += s.substring(0, deleteIdx);
        newString += s.substring(deleteIdx+1, n);

        return newString;
    }
}
