class WordFilter {
    TrieNode trie;
    public WordFilter(String[] words) {
        trie = new TrieNode();
        for (int index = 0; index < words.length ; ++index){
            String word = words[index] + "{";
            for(int i = 0; i < word.length() ; ++i){
                TrieNode cur = trie;
                cur.index = index;
                for(int j = i; j < 2*word.length() -1 ; ++j){
                    //apple{a , apple{ap
                    int k = word.charAt(j % word.length()) - 'a';
                    if(cur.children[k] == null)
                        cur.children[k] = new TrieNode();
                    cur = cur.children[k];
                    cur.index = index;
                }
            }
        }
    }
    
    public int f(String prefix, String suffix) {
        TrieNode cur = trie;
        for (char letter : (suffix + '{' + prefix).toCharArray()){
            if(cur.children[letter - 'a'] == null) return -1;
            cur = cur.children[letter -'a'];
            
        }
        return cur.index;
    }
}

class TrieNode {
    TrieNode [] children;
    int index;
    public TrieNode(){
        children = new TrieNode[27];
        index = 0;
    }
}
