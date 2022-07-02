package newbie0.class06;

/**
 * @author Kiteye
 * @date 2/7/2022
 * @Description 二叉树的最大深度
 */

public class maximumDepthOfBinaryTree {
    class TreeNode {
        public TreeNode left;
        public TreeNode right;
        public int val;
    }

    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
