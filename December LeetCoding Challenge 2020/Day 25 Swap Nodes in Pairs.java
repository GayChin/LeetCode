
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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode forward = head.next; //forward will be the head of two switched element
        head.next = swapPairs(forward.next); //swap next pair
        forward.next = head; // the original 1st value now become next to the forward to swap
        return forward;
    }
}
