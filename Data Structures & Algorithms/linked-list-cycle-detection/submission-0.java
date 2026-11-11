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
    public boolean hasCycle(ListNode head) {
        // Init two pointers equal to head 
        ListNode fast = head;
        ListNode slow = head;

        // Traverse the linked list 
        while(fast != null && fast.next != null){
            // Move fast twice
            fast = fast.next.next; 
            // Move slow twice
            slow = slow.next;
            
            // check if the fast and slow pointers equal eachother
            if(fast == slow){
                return true;
            } 



        }
         


        // Return false if iterated with no result 
        return false;
        
    }
}
