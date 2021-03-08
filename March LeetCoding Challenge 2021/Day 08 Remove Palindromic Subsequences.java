class Solution {
    public boolean isPalindrome(String s){
        int n = s.length();
        for(int i = 0; i < n / 2; i++){
            if(s.charAt(i) != s.charAt(n - 1 - i)){
                return false;
            }
        }
        return true;
    }
    
    public int removePalindromeSub(String s) {
        int n = s.length();
        if(n == 0){
            return 0;
        }
        return isPalindrome(s) ? 1 : 2;
    }
}
