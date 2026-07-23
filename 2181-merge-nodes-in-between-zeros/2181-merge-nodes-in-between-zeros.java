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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(-1) ; 
        int sum = 0 ; 
        ListNode curr = head.next ; 
        ListNode dummyCurr = dummy ; 
        while(curr != null){
            sum = 0 ; 
            while(curr.val != 0){
                sum += curr.val ; 
                curr = curr.next ; 
            }
            ListNode newNode = new ListNode(sum) ; 
            dummyCurr.next = newNode ; 
            dummyCurr = dummyCurr.next ; 
            curr = curr.next ; 
        }
        return dummy.next ; 
    }
}