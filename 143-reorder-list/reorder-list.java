public class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return; // No need to reorder if the list is empty or has only one node
        }

        // Find the middle of the list
        ListNode p1 = head;
        ListNode p2 = head;
        while (p2.next != null && p2.next.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
        }

        // Reverse the half after middle
        ListNode prevMiddle = p1;
        ListNode prevCurrent = p1.next;
        while (prevCurrent.next != null) {
            ListNode current = prevCurrent.next;
            prevCurrent.next = current.next;
            current.next = prevMiddle.next;
            prevMiddle.next = current;
        }

        // Start reordering
        p1 = head;
        p2 = prevMiddle.next;
        while (p1 != prevMiddle) {
            prevMiddle.next = p2.next;
            p2.next = p1.next;
            p1.next = p2;
            p1 = p2.next;
            p2 = prevMiddle.next;
        }
    }
}
