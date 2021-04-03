public class Solution {
    private int[][][] dpTable;

 public int findMaxForm(String[] strs, int m, int n) {
    dpTable = new int[m+1][n+1][strs.length];
    return findMaxFormStartingWith(strs, m, n, 0);
  }
	
  private int findMaxFormStartingWith(String[] strs, int m, int n, int begin) {
    if ((begin==strs.length) || (m+n==0)) {
      return 0;
    }
    // return the result if we have solved for these parameters before
    if (dpTable[m][n][begin] > 0) {
      return dpTable[m][n][begin];
    }
    int countByAddingString = 0;
    String current = strs[begin];
    int zeroes = countZeroesIn(current);
    int ones = current.length()-zeroes;
    if (m>=zeroes && n>=ones) {
      countByAddingString = findMaxFormStartingWith(strs, m-zeroes, n-ones, begin+1)+1;
    }
    int countBySkippingString = findMaxFormStartingWith(strs, m, n, begin+1);
    // store the result for further access
    if (countByAddingString > countBySkippingString) {
      dpTable[m][n][begin] = countByAddingString;
    } else {
      dpTable[m][n][begin] = countBySkippingString;
    }
    return dpTable[m][n][begin];
  }
	
  private int countZeroesIn(String str) {
    int count = 0;
    for (int i=0; i<str.length(); i++) {
      if (str.charAt(i) == '0') {
        count++;
      }
    }
    return count;
  }
}
