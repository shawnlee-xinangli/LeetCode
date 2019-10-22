/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode p = res;
        int sum = 0;
        while (l1 != null || l2 !=null) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            p.next = new ListNode(sum % 10); 
            p = p.next;    
            sum /= 10;
        }
        if (sum != 0) {
            p.next = new ListNode(1);
        }
        return res.next;
    }
}

/*
  Recursion 比较麻烦, 设一个指针和一个sentinel然后移动累加。
  不要忘记最后sum有可能为1，需要进位。
*/
