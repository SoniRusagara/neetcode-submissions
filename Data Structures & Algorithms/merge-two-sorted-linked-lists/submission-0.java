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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create two node pointers 
        ListNode temp = new ListNode(0);
        ListNode curr = temp;

        // Iterate both lists at the same time till both of them are empty 
        while (list1 != null && list2 != null){
            if(list1.val <= list2.val){
                curr.next = list1; 
                list1 = list1.next;
            } else {
                curr.next = list2; 
                list2 = list2.next;
            }
            curr = curr.next;
        }

        // If statements to catch any leftovers 
        if(list1 != null){
            curr.next = list1;
        }

        if(list2 != null){
            curr.next = list2;
        }

        // return the temp.next node which is our head node 
        return temp.next;
    }
}