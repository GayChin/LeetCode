class Solution {
    public String decodeAtIndex(String S, int K) {
        long size = 0;
        int N = S.length();

        // Find size = length of decoded string
        for (int i = 0; i < N; ++i) {
            char c = S.charAt(i);
            if (Character.isDigit(c))
                size *= c - '0';
            else
                size++;                 // use to determine the final size of the string after multiplication
        }

        for (int i = N-1; i >= 0; --i) {    //read from behind
            char c = S.charAt(i);
            K %= size;                     // modulo K from size to find the index of wanted char
            if (K == 0 && Character.isLetter(c))
                return Character.toString(c);   

            if (Character.isDigit(c))
                size /= c - '0';        // last digit will make the same copy for c times, its redundant
            else
                size--;
        }

        throw null;
    }
}
