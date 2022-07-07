package newbie0.class06;

/**
 * @author Kiteye
 * @date 2/7/2022
 * @Description 从前序与中序遍历序列构造二叉树
 * 方法一：循环
 * 方法二：HashMap
 */

public class LeetCode105 {
    static class TreeNode {
        public TreeNode left;
        public TreeNode right;
        public int val;

        public  TreeNode (int val){
            this.val = val;
        }
    }

    public static TreeNode f(int[] preorder,int L1,int R1,int[] inorder ,int L2,int R2) {
        // 当二叉树不是完全二叉树，或者满二叉树是，可能会撞上空树。
        if (L1> R1){
            return null;
        }
        TreeNode head = new TreeNode(preorder[L1]);
        if (L1 == R1) {
            return head;
        }
        int find = L2;
        while(inorder[find] != preorder[L1]){
            find++;
        }
        head.left = f(preorder,L1+1,L1+find-L2,inorder,L2,find-1);
        head.right = f(preorder,L1+find-L2+1,R1,inorder,find+1,R2);
        return head;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length != inorder.length){
            return null;
        }
        return f(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
}
