package 华为机试;

import java.util.Scanner;

class ListNode {
    int value;
    ListNode next;

    //     public ListNode() {
//         // java 构造方法自动初始化 value = 0，next = null
//     }
    public ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}


public class HJ51_倒数k个结点 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int num = scan.nextInt();
            ListNode head = new ListNode(-1);
            ListNode prev = head;
            for (int i = 0; i < num; i++) {
                int value = scan.nextInt();
                prev.next = new ListNode(value);
                prev = prev.next;
            }
            int k = scan.nextInt();
            for (int i = 0; i < num - k + 1; i++) {
                head = head.next;
            }
            System.out.println(head.value);
        }
    }


}



