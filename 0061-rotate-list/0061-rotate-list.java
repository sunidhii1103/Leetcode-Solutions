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

    // Function to find the kth node from the beginning
    public ListNode findNthNode(ListNode temp, int k) {

        int count = 1;

        while (temp != null) {

            if (count == k) {
                return temp;
            }

            count++;
            temp = temp.next;
        }

        return temp;
    }

    public ListNode rotateRight(ListNode head, int k) {

        // Empty list or no rotation needed
        if (head == null || k == 0) {
            return head;
        }

        ListNode tail = head;

        int len = 1;

        // Find the last node and length of the list
        while (tail.next != null) {

            tail = tail.next;
            len++;
        }

        // Reduce unnecessary rotations
        k = k % len;

        // If rotation becomes zero
        if (k == 0) {
            return head;
        }

        // Make the linked list circular
        tail.next = head;

        // Find the new last node
        ListNode newLastNode = findNthNode(head, len - k);

        // New head is the next node
        head = newLastNode.next;

        // Break the circular list
        newLastNode.next = null;

        return head;
    }
}