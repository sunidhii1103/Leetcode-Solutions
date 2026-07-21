/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || left == right) {
            return head;
        }

        // Create a dummy node
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Find the node before 'left'
        ListNode leftPre = dummy;
        ListNode currNode = head;

        for (int i = 0; i < left - 1; i++) {
            leftPre = leftPre.next;
            currNode = currNode.next;
        }

        // Store the first node of the sublist
        ListNode subListHead = currNode;

        // Reverse the sublist
        ListNode preNode = null;

        for (int i = 0; i <= right - left; i++) {
            ListNode nextNode = currNode.next;
            currNode.next = preNode;
            preNode = currNode;
            currNode = nextNode;
        }

        // Connect the reversed sublist back
        leftPre.next = preNode;
        subListHead.next = currNode;

        return dummy.next;
    }
}