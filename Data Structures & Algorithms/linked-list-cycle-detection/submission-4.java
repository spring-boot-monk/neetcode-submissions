/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode preHead = new ListNode(0, head);
        ListNode fast = preHead;
        ListNode slow = preHead;

        do{
            fast = fast.next == null ? null : fast.next.next;
            slow = slow.next;
        }while(fast != null && fast != slow);

        return fast != null;
    }
}
