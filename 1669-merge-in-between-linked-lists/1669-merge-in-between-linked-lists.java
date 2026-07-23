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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int level = 0 ; 
        ListNode dummy = new ListNode(-1) ; 
        dummy.next = list1 ; 
        ListNode prevA = list1 ; 
        for(int i = 0 ;  i < a - 1 ; i++){
            prevA = prevA.next ; 
        }
        ListNode prevB = prevA ; 
        for(int i = 0 ; i < b - a + 2 ; i++){
            prevB= prevB.next ; 
        }
        ListNode tail = list2 ; 
        while(tail.next != null){
            tail = tail.next ; 
        }
        prevA.next = list2 ; 
        tail.next = prevB ;
        return dummy.next ; 
    }
}