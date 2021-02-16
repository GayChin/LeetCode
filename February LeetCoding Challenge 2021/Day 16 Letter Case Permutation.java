// check each character if it is a character then change it to opposite case (either upper or lower) then continue carrying out DFS.
// Will stop once reached a non-character character
// Continue to check the 2nd index.

class Solution {
    public List<String> letterCasePermutation(String S) {
        List<String> result = new ArrayList<>();
        char[] ch = S.toCharArray();
        permute(ch, result, 0);
        return result;
    }
    
    public void permute(char[] ch, List<String> result, int index) {
        result.add(new String(ch));
        for(int i=index; i< ch.length; i++) {
            char c = ch[i];
            if(Character.isLetter(c)) {
                ch[i] = getModifiedLetter(c);
                permute(ch, result, i+1);
                ch[i] = c;
            }
        }
    }
    
    public char getModifiedLetter(char c){
        return Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);
    }
}
