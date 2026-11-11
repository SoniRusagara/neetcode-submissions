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
    public ListNode reverseList(ListNode head) {
        // Create 3 init pointers prev/next/curr
        ListNode prev = null, curr = head, next = null;

        /**
        * Learning Point: 
        * Use only curr != null not also curr.next != null 
        * bc that takes you to only the second last node which misses it
        */
        // Traverse through the list when both curr && curr.next != null
        while (curr != null){
            // Save the next node: next = curr.next 
            next = curr.next; 
            // Reverse the current node's next ptr to the prev one 
            curr.next = prev;
            // Advance the prev ptr 
            prev = curr; 
            // Advance the curr ptr
            curr = next;
        }
        // Return prev 
        return prev;     
    }
}
