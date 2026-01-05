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
    public boolean isPalindrome(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy ;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = reverse(slow);
        fast = head;
        while(slow.next != null){
            if(slow.val != fast.val){
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }
    ListNode reverse(ListNode head){
        ListNode next = null ;
        ListNode curr = head ;
        ListNode prev = null ;
        while(curr != null){
            next = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = next ;
        }
        return prev;
    }
}