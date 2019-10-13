public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        if (slow == null) {
            return false;
        }
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}

/*
  双指针法，把cycle list想成环形跑道，fast的速度是2，slow的速度是1, 如果有cycle，fast一定会追上slow，也就是会相等，
  如果没有cycle，fast 或者 fast.next会先碰到尽头null。
*/
