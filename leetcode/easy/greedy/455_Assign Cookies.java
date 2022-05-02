class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        for(int j = 0; j < s.length && i < g.length; j++){
            
            if(s[j] >= g[i]){
                i++;
            }
        }
        
        return i;
    }
}
