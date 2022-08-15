package LeetCode;

/**
 * @author Kiteye
 * @date 15/8/2022
 * @Description  两两交换链表中的节点
 */

class ListNode {
    public ListNode next;
    int val;

}

public class LeetCode_24 {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        // 链表一遍定义一个空的头结点
        ListNode resultHead = new ListNode();
        // 最后要返回的是链表的头结点
        resultHead.next = head;
        // 为了不修改原节点的位置，避免垃圾回收
        ListNode cur =resultHead;

        while(cur!=null && cur.next!=null && cur.next.next!=null) {
            ListNode f = cur;
            ListNode s = cur.next;
            ListNode t = cur.next.next;

            cur.next = t;
            s.next = t.next;
            t.next = s;

            cur = cur.next.next;

        }
        // 最后返回 空节点的下一个节点正式节点。
        return resultHead.next;
    }
}
