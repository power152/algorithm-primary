package newbie0.class06;

/**
 * @author Kiteye
 * @date 1/7/2022
 * @Description 二叉树的前序遍历，中序遍历，后续遍历，递归序
 * 前序遍历：根左右
 * 中序遍历：左根右
 * 后续遍历：左右根
 * 重点理解递归序。
 */


public class traversalBinary {

    static class Node {
        public int v;
        public Node left;
        public Node right;

        public Node(int v){
            this.v = v;
        }
    }

    // 递归序,所有递归的基石。
    public static void f(Node head){
        if (head == null){
            return;
        }
        //1
        f(head.left);
        // 2
        f(head.right);
        //3
    }

    // 先序遍历 ----> 根左右
    public static void pre(Node head){
        if (head == null){
            return;
        }
        System.out.print(head.v+" ");
        pre(head.left);
        pre(head.right);
    }


    // 中序遍历 ----> 左根右
    public static void mid(Node head){
        if (head == null){
            return;
        }
        mid(head.left);
        System.out.print(head.v + " ");
        mid(head.right);
    }

    // 后序遍历 ----> 左右根
    public static void pos(Node head){
        if (head == null){
            return;
        }
        pos(head.left);
        pos(head.right);
        System.out.print(head.v + " ");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.left = new Node(2);
        head.right = new Node(3);
        head.left.left = new Node(4);
        head.left.right = new Node(5);
        head.right.left = new Node(6);
        head.right.right = new Node(7);

        pre(head);
        System.out.println();
        mid(head);
        System.out.println();
        pos(head);

    }
}
