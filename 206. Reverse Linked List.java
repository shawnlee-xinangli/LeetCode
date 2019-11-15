
/*Recursive Solution*/
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        ListNode res = reverseList(next);
        head.next = null;
        next.next = head;
        return res;
    }
}

/*Iterative Solution*/
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode newhead = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = newhead;
            newhead = head;
            head = next;
        }
        return newhead;
    }
}
