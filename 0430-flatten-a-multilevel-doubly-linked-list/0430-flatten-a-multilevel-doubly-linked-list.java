class Solution {

    public Node flatten(Node head) {

        if (head == null)
            return head;

        Node curr = head;

        while (curr != null) {

            if (curr.child != null) {

                Node next = curr.next;

                // Flatten child
                Node childHead = flatten(curr.child);

                curr.next = childHead;
                childHead.prev = curr;

                curr.child = null;

                // Find tail
                Node tail = childHead;

                while (tail.next != null) {
                    tail = tail.next;
                }

                // Attach next
                tail.next = next;

                if (next != null) { //Only connect if a next node actually exists.
                    next.prev = tail;
                }
            }

            curr = curr.next;
        }

        return head;
    }
}