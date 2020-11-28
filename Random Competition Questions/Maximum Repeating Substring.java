    public static void main(String[] args) {
        String sequence = "baba";
        String word = "b";
        int count = 0;
        String test =word;
        while(true){
        if(sequence.contains(test)){
            count++;
            test = test.concat(word);
        }else {
            break;
        }
        }
        System.out.println(count);
}
