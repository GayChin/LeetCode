class FreqStack {
    Map<Integer, Integer> freq; //track MAX frequency 
    Map<Integer, Stack<Integer>> group; // track each number whenever                                               their frequency changes
    int maxfreq;

    public FreqStack() {
        freq = new HashMap();
        group = new HashMap();
        maxfreq = 0;
    }

    public void push(int x) {
        int f = freq.getOrDefault(x, 0) + 1;
        freq.put(x, f);
        if (f > maxfreq)
            maxfreq = f;
        //everytime a number has a new frequency we create a stack
        group.computeIfAbsent(f, z-> new Stack()).push(x);
    }

    public int pop() {
        //we find the number with maxfreq and pop its stack 
        int x = group.get(maxfreq).pop();
        //and reduce its value in the freq map
        freq.put(x, freq.get(x) - 1);
        //if the maxfreq no longer exist, reduce the max freq
        if (group.get(maxfreq).size() == 0)
            maxfreq--;
        return x;
    }
}
