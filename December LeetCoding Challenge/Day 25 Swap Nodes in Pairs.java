
indiaCoder's avatar
indiaCoder
297
Last Edit: 18 hours ago

186 VIEWS



// https://www.youtube.com/watch?v=2-fFzM4wtlI&feature=youtu.be



/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
	
	// Iterative way
	
	//TC O(n) SC:O(1) 
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        while(prev.next!=null && prev.next.next!=null){
            ListNode current = prev.next;
            ListNode forward = current.next;
            ListNode temp = forward.next;
            
            prev.next = forward;
            forward.next = current;
            current.next= temp;
            
            prev = current;
            
        }
        return dummy.next;
    }
	
	// Recursive solution
	
	 // O(N) Time complexity
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode forward = head.next;
        head.next = swapPairs(forward.next);
        forward.next = head;
        return forward;
    }
}
