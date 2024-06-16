class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head; // No rotation needed if the list is empty, has only one node, or if k is 0
        }
        
        // Calculate the length of the list and find the last node
        int length = 1;
        ListNode lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            length++;
        }
        
        // Connect the last node to the head to form a cycle
        lastNode.next = head;
        
        // Calculate the actual rotation amount
        int rotation = k % length;
        
        // Calculate the number of nodes to skip
        int skip = length - rotation;
        
        // Find the new last node
        ListNode newLast = head;
        for (int i = 0; i < skip - 1; i++) {
            newLast = newLast.next;
        }
        
        // Update the head and break the cycle
        head = newLast.next;
        newLast.next = null;
        
        return head;
    }
}
