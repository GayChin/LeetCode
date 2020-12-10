class Solution {
public static int smallestRepunitDivByK(int K) {
    int length =1;
    int testNumber =1;
    if(K%2 == 0 || K%5 ==0){  // 1,11,111 will never be modulo-able by 2 and 5
        
        return -1;
        
    }
    while(testNumber % K != 0){
        testNumber = (testNumber % K)*10 + 1;   // 111 mod 13 = 7 , 111 mod 13 = 7  
        length ++;                              // 1111 mod 13 = 6 , 7*10+1 mod 13 = 6  
    }                                           //  11111 mod 13 = 9, 6*10+1 mod 13 = 9
    return length;
}
}
