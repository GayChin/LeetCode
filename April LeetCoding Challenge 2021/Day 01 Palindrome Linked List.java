class Solution {
    public boolean isPalindrome(ListNode head) {
        //initialize a dummy head
        ListNode start = new ListNode(-1);
        //connect to the list nodes
        start.next = head;
        
        return isPalindrome (start, head);
        
        
    }
    
    public boolean isPalindrome (ListNode start, ListNode end){
        if(end == null) return true;
        //recur until the last element
        boolean accumulatedEqual = isPalindrome(start,end.next);
        //check the first value and the last value first time 
        boolean isEqual = start.next.val == end.val;
        start.next = start.next.next;
        return accumulatedEqual && isEqual;
        
    }
    
    
}
