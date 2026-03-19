package Assignments.Assignment4.Module10.LinkedList;

// LeetCode 876 - Middle of the Linked List
class MiddleLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        MiddleLinkedList obj = new MiddleLinkedList();
        System.out.println("Middle Node: " + obj.middleNode(head).val); // 3
    }
}