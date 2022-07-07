package newbie0.class07;

/**
 * @author Kiteye
 * @date 7/7/2022
 * @Description leetcode 112 路径总和
 * 使用递归
 */

public class Path_Sum {
    public static class TreeNode {
        public TreeNode left;
        public TreeNode right;
        public int val;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    // 这是一个全局变量，会有很多树调用，如果某一颗树 isSum为true了，全局变量就会变成 true，所以在方法里面还有重新定义一遍。
    public static boolean isSum = false;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        // 需要在方法里面确认一遍
        isSum = false;
        porcess(root,0,targetSum);
        return isSum;
    }

    // 三个参数 根，前缀和，最终结果
    public static void porcess(TreeNode root, int preSum, int sum) {
        // 判断叶子节点的sum
        if (root.left == null && root.right == null) {
            if (root.val + preSum == sum) {
                // 全局变量
                isSum = true;
            }
            return;
        }
        preSum += root.val;
        // 递归继续累加和，知道叶节点是null
        if (root.left != null) {
            porcess(root.left, preSum, sum);
        }
        if (root.right != null) {
            porcess(root.right, preSum, sum);
        }
    }
}
