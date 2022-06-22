package newbie0.class04;

/**
 * @author liuyandeng
 * @date 2/6/2022
 * @Description K个节点的组内逆序调整问题：
 */

public class ReverseNodesInKGroup {
    public static class ListNode {
        public int val;
        public ListNode next;
    }

    public static ListNode getKGroupEnd(ListNode start, int k) {
        while (--k != 0 && start != null) {
            start = start.next;
        }
        return start;
    }

    public static void reverse(ListNode start, ListNode end) {
        end = end.next;
        ListNode cur = start;
        ListNode pre = null;
        ListNode next = null;
        // 我们要反转[s,e]这一坨，先让e走一步
        while(cur != end) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        // 最后的引用要指向end
        start.next =end;
    }

    // 这里是编写主逻辑
    public static ListNode reverseKGroup(ListNode head,int k) {
        ListNode start = head;
        ListNode end = getKGroupEnd(start,k);
        // 根据题目要求不满足 k 组的就直接打印下来
        if (end == null) {
            return head;
        }

        // 代码到这里第一组就凑齐了
        head = end; // 左后是返回最新的head，并且是反转效果
        reverse(start,end);
        ListNode lastEnd = start; // 上一组结尾结点
        while(lastEnd.next !=null) {
            start = lastEnd.next;
            end = getKGroupEnd(start,k);
            if(end == null){
                return head;
            }
            reverse(start,end);
            lastEnd.next =end;
            lastEnd =start;
        }
        return head;
    }


}
