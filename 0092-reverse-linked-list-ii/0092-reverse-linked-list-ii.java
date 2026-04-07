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



//  int k = templ.val;
//      templ.val = tempr.val;
//      tempr.val = k;


class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
// int l,r = left,right;
//         ListNode temp = head;
//         int count = 0;
//         while(temp !=null){
//             temp = temp.next;
//             count++;
//         }

//         if(count == 1){
//             return head;
//         }

//         ListNode templ = head;

//         ListNode tempr = head;

//      for(int i = 1; i < left ; i++){
//         templ = templ.next;
//      }
//      for(int i = 1; i < right ; i++){
//         tempr = tempr.next;
//      }
//      while(l < r){
//         int k = templ.val;
//      templ.val = tempr.val;
//      tempr.val = k;
//      }

//      return head;
if (head == null || left == right) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        ListNode curr = prev.next;

        for (int i = 0; i < right - left; i++) {
            ListNode nextNode = curr.next;
            curr.next = nextNode.next;
            nextNode.next = prev.next;
            prev.next = nextNode;
        }

        return dummy.next;
    }
}