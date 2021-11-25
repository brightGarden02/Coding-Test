class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int left = 0;
        int right = 0;
        Set<Character> set = new HashSet<>();
        int maxCount = 0;
        
        while(right < s.length()){
            
            while(set.contains(s.charAt(right)))
                set.remove(s.charAt(left++));
            
            set.add(s.charAt(right));
            
            maxCount = Math.max(maxCount, right-left+1);
            right++;
            
            
        }
        return maxCount;
    }
}
