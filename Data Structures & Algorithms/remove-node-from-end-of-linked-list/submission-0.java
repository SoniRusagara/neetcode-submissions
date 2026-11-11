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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a temp node & fast and slow pointers
        ListNode temp = new ListNode(0, head);
        ListNode fast = temp; 
        ListNode slow = temp;

        // Create n sized gap by moving fast ptr to n: fast < n : fast.next
        for(int i = 0; i < n; i++){
            fast = fast.next;
        }

        // Move slow and fast ptr by one while fast != null 
        while(fast.next != null){
            fast = fast.next; 
            slow = slow.next;
        }

        // remove nth node by slow = slow.next.next 
        slow.next = slow.next.next;

        // return temp.next as this is the head 
        return temp.next;
    }
}
