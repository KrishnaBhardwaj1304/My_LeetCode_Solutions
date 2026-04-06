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
     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    //    ListNode temp1 = l1;
    //    ListNode temp2 = l2;
    //    int x = temp1.val;
    //    int y = temp2.val;
    //    int sum = x + y;
    //    int digit = sum % 10 ;
    //    int carry = sum / 10 ;

    //    ListNode ans = new ListNode(digit);
    //    ListNode curr = ans;
    //    curr = curr.next;
    //    if(temp1 != null) temp1 = temp1.next;
    //     if(temp2 != null) temp2 = temp2.next;

    //    while(temp1 != null || temp2 != null || carry != 1){
    //     x = (temp1 != null) ? temp1.val : 0;
    //     y = (temp2 != null) ? temp2.val : 0;
    //     sum = x + y + carry;
    //     digit = sum % 10;
    //     carry = sum / 10;
    //     curr.next = new ListNode(digit);
    //     if(temp1 != null) temp1 = temp1.next;
    //     if(temp2 != null) temp2 = temp2.next;
    //    }
    //    return ans;
// the second approach.... 
    ListNode temp1 = l1;
        ListNode temp2 = l2;

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        int carry = 0;

        while (temp1 != null || temp2 != null || carry != 0) {
            int x = (temp1 != null) ? temp1.val : 0;
            int y = (temp2 != null) ? temp2.val : 0;

            int sum = x + y + carry;
            int digit = sum % 10;
            carry = sum / 10;

            curr.next = new ListNode(digit);
            curr = curr.next;

            if (temp1 != null) temp1 = temp1.next;
            if (temp2 != null) temp2 = temp2.next;
        }

        return dummy.next;
        


    }
}