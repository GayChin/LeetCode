//stack solution
class Solution {
    public int scoreOfParentheses(String S) {
        Stack<Integer> stack = new Stack();
        stack.push(0); // The score of the current frame

        for (char c: S.toCharArray()) {
            if (c == '(')
                stack.push(0);
            else {
                int v = stack.pop(); //v is the prev layer
                int w = stack.pop();
                //if curent c is closing bracket
                //multiply v with 2  
                stack.push(w + Math.max(2 * v, 1));
            }
        }

        return stack.pop();
    }
}

//count core
class Solution {
    //bal = number of exterior bracket
    // the goal here is to multiply a complete interior bracket with the number of exterior bracket.
    public int scoreOfParentheses(String S) {
        int ans = 0, bal = 0;
        for (int i = 0; i < S.length(); ++i) {
            if (S.charAt(i) == '(') {
                bal++;
            } else {
                bal--;
                if (S.charAt(i-1) == '(')
                    ans += 1 << bal;
            }
        }

        return ans;
    }
}
