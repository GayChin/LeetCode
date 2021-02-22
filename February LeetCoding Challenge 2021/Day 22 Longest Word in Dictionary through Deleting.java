class Solution {
    
    //for each string in d 
    // for each char in s
    // check if each char in s is equal to each char in the string of d
    public String findLongestWord(String s, List<String> d) {
        String longest = "";
        for (String dictWord : d) {
            int i = 0; //position of the char in string of d
            
            for (char c : s.toCharArray()) 
                if (i < dictWord.length() && c == dictWord.charAt(i)) i++;
            
            //if match and longest than previous matching word
            
            if (i == dictWord.length() && dictWord.length() >= longest.length()) 
                if (dictWord.length() > longest.length() || dictWord.compareTo(longest) < 0)
                    longest = dictWord;
        }
        return longest;
    }
 
}
