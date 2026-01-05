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
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode dummy = new ListNode(-101);
        dummy.next = head;
        ListNode curr = dummy.next ;
        ListNode prev = dummy;
        while(curr != null){
            if(curr.val == prev.val){
                curr = curr.next ;
                prev.next = curr ;
            }else{
                prev = curr ;
                curr = curr.next;
            }
        }
        return dummy.next;
    }
}