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
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode dummy = new ListNode(0);
        ListNode curr = head;

        while (curr != null) {
            // At each iteration, we try to find the place to insert 'curr'
            // in the list starting from 'dummy'
            ListNode prev = dummy;
            
            // Move 'prev' until we find the node after which 'curr' should be placed
            while (prev.next != null && prev.next.val < curr.val) {
                prev = prev.next;
            }

            // Save the next node to process
            ListNode nextTemp = curr.next;

            // Insert 'curr' between 'prev' and 'prev.next'
            curr.next = prev.next;
            prev.next = curr;

            // Move to the next node in the original list
            curr = nextTemp;
        }

        return dummy.next;
    }
}