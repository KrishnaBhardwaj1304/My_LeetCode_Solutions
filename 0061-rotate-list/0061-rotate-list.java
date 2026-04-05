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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode x = head;
        int count = 0;
        while(x != null){
            count++;
            x = x.next;
        }
        int l = k%count;
        for(int i = 0; i < l; i++){
            ListNode temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            ListNode last = temp.next;
            temp.next = null;
            last.next = head;
            head = last;
        }
        return head;
    }
}