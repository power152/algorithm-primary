package newbie0.class07;

/**
 * @author Kiteye
 * @date 7/7/2022
 * @Description 验证是否是搜索二叉树
 *
 * 左树的值比root小，右树的值比root大
 * 也是需要一个类，记录三个信息，
 * 1、整体是否是 IsBST、
 * 2、左树的max
 * 3、右树的min
 */

public class IsBinarySearchTree {

    public static class TreeNode {
        public TreeNode left;
        public TreeNode right;
        public int val;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static class Info {
        public boolean isBTS;
        public int max;
        public int min;

        public Info(boolean isBTS, int max, int min) {
            this.isBTS = isBTS;
            this.max = max;
            this.min = min;
        }
    }

    public boolean isValidBST(TreeNode root) {
        return process(root).isBTS;
    }

    public static Info process(TreeNode root) {
        if (root == null) {
            return null;
        }
        Info leftInfo = process(root.left);
        Info rightInof = process(root.right);
        int max = root.val;
        int min = root.val;
        // 1、把左树和右树真的max和min找出来
        if (leftInfo != null) {
            max = Math.max(leftInfo.max, max);
            min = Math.min(leftInfo.min, min);
        }
        if (rightInof != null) {
            max = Math.max(rightInof.max, max);
            min = Math.min(rightInof.min, min);
        }

        // 2、先假设 isBTS 为 true 或者 false
        boolean isBTS = true;
        if (leftInfo != null && !leftInfo.isBTS) {
            isBTS = false;
        }
        if (rightInof != null && !rightInof.isBTS) {
            isBTS = false;
        }
        ///3、left.max<root      right.min>root 才成立
        boolean leftMaxLess = leftInfo == null ? true : (leftInfo.max < root.val);
        boolean rightMinMore = rightInof == null ? true : (rightInof.min > root.val);
        if (!leftMaxLess || !rightMinMore){
            isBTS = false;
        }
        return new Info(isBTS,max,min);
    }
}
