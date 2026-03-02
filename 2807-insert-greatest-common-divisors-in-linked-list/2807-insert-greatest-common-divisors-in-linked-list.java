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
    public int gcd(int a , int b) {
        if(b == 0 ){
            return a ; 
        }
        return gcd( b , a % b) ; 
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head == null || head.next == null){
            return head ; 
        }
        ListNode dummy = new ListNode(-1) ; 
        dummy.next = head ; 

        ListNode curr = head ;
        while(curr != null && curr.next != null){
            int val1 = curr.val ; 
            int val2 = curr.next.val ; 
            int val3 = gcd(Math.max(val1 , val2) , Math.min(val1 , val2)) ; 
            ListNode node = new ListNode(val3) ; 
            node.next = curr.next ; 
            curr.next = node ; 
            curr = curr.next.next ; 
        }
        return dummy.next ; 
    }
}