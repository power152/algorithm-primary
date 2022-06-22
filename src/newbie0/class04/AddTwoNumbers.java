package newbie0.class04;

/**
 * @author liuyandeng
 * @date 3/6/2022
 * @Description 两个链表相加问题
 */

public class AddTwoNumbers {
    public static class ListNode {
        public ListNode next;
        public int value;

        public ListNode(int val) {
            this.value = val;
            this.next = next;
        }

    }

    public static ListNode addTwoNumbers(ListNode head1, ListNode head2) {
        // 首先要找到短的链表和长的链表
        int len1 = listLength(head1);
        int len2 = listLength(head2);

        ListNode l = len1 >= len2 ? head1 : head2;
        ListNode s = l == head1 ? head2 : head1;

        ListNode curL = l;
        ListNode curS = s;
        ListNode last = curL;
        int carry = 0;
        int curNum = 0;
        while(curS != null) {
            curNum = curL.value +curS.value +carry;
            curL.value = curNum%10;
            carry = curNum/10;
            last = curL;
            curL = curL.next;
            curS = curS.next;
        }
        while(curL != null) {
            curNum = curL.value +carry;
            curL.value = curNum%10;
            carry = curNum/10;
            last =curL;
            curL = curL.next;

        }
        if (carry != 0) {
            last.next = new ListNode(1);
        }

        return l;
    }

    // 求链表长度
    public static int listLength(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }

}
