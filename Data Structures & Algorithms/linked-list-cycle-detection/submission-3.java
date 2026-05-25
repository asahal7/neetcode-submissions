class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;

        ListNode slow = head.next; // 2
        ListNode fast = head.next.next; // 3

        while (fast != null && fast.next != null) {
            slow = slow.next; // 2
            fast = fast.next.next; // 4
            if (slow == fast) return true;
        }
        return false;


    }
}
