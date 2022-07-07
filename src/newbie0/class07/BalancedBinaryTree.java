package newbie0.class07;

/**
 * @author Kiteye
 * @date 7/7/2022
 * @Description
 *
 * 创建一个类，里面有两个信息
 * 1、整体是否是平衡数
 * 2、整颗树的高度是什么
 * 然后递归获取两个信息，判断是否平衡
 */

public class BalancedBinaryTree {

    public static class TreeNode {
        public TreeNode left;
        public TreeNode right;
        public int val;

        public TreeNode (int val){
            this.val = val;
        }
    }

    // 这里就记录了两个信息，整体树的高度，整体树是否平衡。
    public static class Info {
        public boolean isBalanced;
        public int height;

        public Info(boolean isBalanced, int height){
            this.isBalanced = isBalanced;
            this.height = height;
        }
    }

    public boolean isBalanced(TreeNode root) {
        return process(root).isBalanced;
    }

    public static Info process(TreeNode root){
        if (root == null){
            return new Info(true,0);
        }
        Info leftInfo = process(root.left);
        Info rightInfo = process(root.right);
        int height = Math.max(leftInfo.height,rightInfo.height) +1;
        boolean isBalanced = leftInfo.isBalanced && rightInfo.isBalanced
                             && Math.abs(leftInfo.height- rightInfo.height) <2;
        return new Info(isBalanced,height);
    }
}
