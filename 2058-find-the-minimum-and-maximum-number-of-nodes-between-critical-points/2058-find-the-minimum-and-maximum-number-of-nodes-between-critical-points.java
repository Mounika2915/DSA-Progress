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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head.next.next == null){
            return new int[]{-1,-1};
        }
        ListNode curr = head.next ; 
        ListNode prev = head ; 
        List<Integer> list = new ArrayList<>() ; 
        int idx = 1 ;
        while(curr != null && curr.next != null) {
            if(prev.val > curr.val && curr.val < curr.next.val){
                list.add(idx) ; 
            }
            if(prev.val < curr.val && curr.val > curr.next.val){
                list.add(idx) ; 
            }
            prev = curr ; 
            curr = curr.next ; 
            idx++;
        }
        
if (list.size() < 2) {
            return new int[]{-1, -1};
        }

         int minDist = Integer.MAX_VALUE;

        for (int i = 1; i < list.size(); i++) {
            minDist = Math.min(minDist, list.get(i) - list.get(i - 1));
        }

        int maxDist = list.get(list.size() - 1) - list.get(0);

        return new int[]{minDist, maxDist};

        
         
    }
}