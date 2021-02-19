//Negate the index to indicate ')'.
//Add 1 to make the index 1-based. You cannot tell if zero is negated.

class Solution {
public String minRemoveToMakeValid(String s) {

    StringBuilder sb = new StringBuilder (s);
    Stack <Integer> st = new Stack <>();
    for (int i = 0 ; i < sb.length() ; i ++){
        if(sb.charAt(i) == '('){
            st.push(i + 1);
        }else if (sb.charAt(i) == ')'){
            if(!st.isEmpty() && st.peek() >= 0 ){
                st.pop();
            }else {
                st.push(-(i+1));
            }
            
        }
        
    }
    
    while(!st.isEmpty()){
        sb.deleteCharAt(Math.abs(st.pop())-1);
    }
    
    return sb.toString();
}
}
