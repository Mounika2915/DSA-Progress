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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head ; 
        }
        while(head != null && head.val == val){
            head = head.next ; 
        }
        if(head == null){
            return head ; 
        }
        ListNode dummy = new ListNode(-1) ; 
        dummy.next = head ; 
        ListNode curr = head ;
        while(curr != null && curr.next != null){
            while(curr.next != null && curr.next.val == val){
                curr.next = curr.next.next ; 
            }
            curr = curr.next ; 
        }
        return dummy.next ;
    }
}