class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0); // Sorted list dummy head
        ListNode current = head;

        while (current != null) {
            // Store next node before changing links
            ListNode next = current.next;

            // Find insertion position
            ListNode prev = dummy;

            while (prev.next != null && prev.next.val < current.val) {
                prev = prev.next;
            }

            // Insert current node
            current.next = prev.next;
            prev.next = current;

            // Move to next node
            current = next;
        }

        return dummy.next;
    }
}