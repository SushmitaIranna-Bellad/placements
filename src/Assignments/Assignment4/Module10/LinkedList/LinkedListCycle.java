package Assignments.Assignment4.Module10.LinkedList;
// LeetCode 141 - Linked List Cycle
class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            if (slow == fast) return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = head; // cycle
        LinkedListCycle obj = new LinkedListCycle();
        System.out.println("Has Cycle: " + obj.hasCycle(head)); // true
    }
}

