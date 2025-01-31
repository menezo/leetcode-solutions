package problem2_AddTwoNumbers;

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
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // Initialize dummy head and current pointer
        ListNode head = new ListNode(0);
        ListNode current = head;

        int carry = 0;

        while (l1 != null || l2 != null || carry > 0) {
            // Extract values from current nodes (or 0 if null)
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            // Compute sum and carry
            int sum = val1 + val2 + carry;
            // Create new node and advance pointers
            current.next = new ListNode(sum % 10);
            current = current.next;
            carry = sum / 10;

            if(l1 != null) {
                l1 = l1.next;
            }
            if(l2 != null) {
                l2 = l2.next;
            }
        }
        return head.next;
    }
}
