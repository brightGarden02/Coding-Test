import java.util.HashSet;

class Solution {
    public int solution(String numbers) {
        int answer = 0;
        
        HashSet<Integer> hs = new HashSet<>();
        
        permutation("", numbers, hs);
        
        while(hs.iterator().hasNext()){
            
            int number = hs.iterator().next();
            
            hs.remove(number);
            
            if(isPrime(number)){
                answer++;
            }
        }        
        return answer;
    }
    
    public void permutation(String prefix, String str, HashSet<Integer> hs){
        
        int n = str.length();
        if(!prefix.equals("")){
            hs.add(Integer.parseInt(prefix));
        }
        
        for(int i = 0; i < n; i++){
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), hs);
        }
        
        
    }
    
    public boolean isPrime(int n){ 
        if(n == 0 || n == 1)
            return false;
        for(int i = 2; i <= (int)Math.sqrt(n); i++){
            if( n % i == 0)
                return false;
        }
        return true;
    }
}
