package newbie0.class04;

/**
 * @author liuyandeng
 * @date 31/5/2022
 * @Description 关于链表操作。
 */

public class ReverseList {
    public static class Node {
        public int value;
        public Node next;


        public Node(int value) {
            this.value = value;

        }
    }

    public static class DoubleNode {
        public int value;
        public DoubleNode next;
        public DoubleNode last;

        public DoubleNode(int value) {
            this.value = value;
        }
    }

    // 链表头结点传入f函数中是复制的一份 head地址，不是本身，相当于head'
    public static void f(Node head) {
        head = head.next.next;
    }

    public static Node reverseLinkedList(Node head) {
        Node next = null;
        Node pre = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public static DoubleNode reverseDoubleList(DoubleNode head) {
        DoubleNode next = null;
        DoubleNode pre = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            head.last = next;
            pre =head;
            head = next;
        }
        return pre;
    }


    public static void main(String[] args) {
        Node n1 = new Node(1);
        n1.next = new Node(2);
        n1.next.next = new Node(3);
        // 为什么反转还是1？因为上游head不变，head'在变，最后JVM只会把head后面都释放掉，因为没有引用指向了
        //reverseLinkedList(n1);

        while (n1 != null) {
            n1 = reverseLinkedList(n1);
            System.out.print(n1.value + " ");
            n1 = n1.next;
        }
        // 所以要用 head 变到最后
        //f(n1);
        System.out.println(n1.value);
    }


}
