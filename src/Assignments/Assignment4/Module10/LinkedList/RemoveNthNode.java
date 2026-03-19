package Assignments.Assignment4.Module10.LinkedList;
// LeetCode 19 - Remove Nth Node From End of List
class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode first = dummy, second = dummy;
        for (int i = 0; i <= n; i++) first = first.next;
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        RemoveNthNode obj = new RemoveNthNode();
        ListNode res = obj.removeNthFromEnd(head, 2);
        System.out.print("After Removal: ");
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}

