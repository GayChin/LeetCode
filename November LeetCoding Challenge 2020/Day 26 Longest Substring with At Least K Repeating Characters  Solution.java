class Solution {
    public int longestSubstring(String s, int k) {
        if (s == null || s.isEmpty() || k > s.length()) {
            return 0;
        }
        int[] countMap = new int[26];
        int n = s.length();
        int result = 0;
        for (int start = 0; start < n; start++) {      //two for-loop form sub string 
            // reset the count map
            Arrays.fill(countMap, 0);
            for (int end = start; end < n; end++) { 
                countMap[s.charAt(end) - 'a']++;      //store the frequency of each alphabet into array
                if (isValid(s, start, end, k, countMap)) {
                    result = Math.max(result, end - start + 1);   compared with previous result and take the bigger one.
                }
            }
        }
        return result;
    }

    private boolean isValid(String s, int start, int end, int k, int[] countMap) {
        int countLetters = 0, countAtLeastK = 0;
        for (int freq : countMap) {
            if (freq > 0) countLetters++;
            if (freq >= k) countAtLeastK++;
        }
        return countAtLeastK == countLetters;
    }
}
