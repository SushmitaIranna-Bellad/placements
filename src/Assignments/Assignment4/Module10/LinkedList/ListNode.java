package Assignments.Assignment4.Module10.LinkedList;
// Helper class for ListNode
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

// LeetCode 206 - Reverse Linked List
class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
        ReverseLinkedList obj = new ReverseLinkedList();
        ListNode res = obj.reverseList(head);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}
