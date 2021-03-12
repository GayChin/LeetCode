class Solution {
    public boolean hasAllCodes(String s, int k) { 
        int toBeFound = 1 << k; // Math.pow(1,k)
        Set <String> set = new HashSet<String>();
        for (int i = k ; i <= s.length() ; i++){
        String sub = s.substring(i-k,i);
        if(!set.contains(sub)){
            set.add(sub);
            toBeFound --;
            if(toBeFound == 0){
                return true;
            }
        }
        }
        
        return false;
    }
}
