class Solution {
    public int numUniqueEmails(String[] emails) {
        
        Set<String> result = new HashSet<>();
        
        for(String id:emails){
         
            String[] tmp = id.split("@");
            
            tmp[0] = tmp[0].replaceAll("\\.", "");
            tmp[0] = tmp[0].split("\\+")[0];
            
            result.add(tmp[0] + "@" + tmp[1]);
        
        }
        
        return result.size();
    }
}