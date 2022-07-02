package newbie0.class06;

/**
 * @author Kiteye
 * @date 2/7/2022
 * @Description
 */

public class SymmetricTree {
    class TreeNode {
        public TreeNode left;
        public TreeNode right;
        public int val;
    }

    public boolean isMirror(TreeNode h1, TreeNode h2) {
        if (h1 == null ^ h2 == null) return false;
        if (h1 == null && h2 == null) return true;
        return h1.val == h2.val && isMirror(h1.left, h2.right) && isMirror(h1.right, h2.left);
    }

    public boolean isSymmetric(TreeNode root) {
        // 判断是否对称，可以用两个树来比较，像镜子一样对称比较
        return isMirror(root, root);
    }
}
