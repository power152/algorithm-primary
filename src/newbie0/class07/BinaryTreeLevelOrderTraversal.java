package newbie0.class07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Kiteye
 * @date 7/7/2022
 * @Description 二叉树的层级遍历
 * <p>
 * 这道题是一层大List里面嵌套的小List，返回的就是一层一层的List
 * 1、拿出此时队列的size，size又多少步骤2就进行多少回
 * 2、弹出结点有左现加左，有右再加右
 */

public class BinaryTreeLevelOrderTraversal {

    public static class TreeNode {
        public TreeNode left;
        public TreeNode right;
        public int val;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        // 这是一个大链表 [[15,7],[9,20],[3]] ，里面存放了小链表
        List<List<Integer>> ans = new LinkedList<>();
        if (root == null) {
            return ans;
        }
        // 使用队列来添加并且弹出
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> curAns = new LinkedList<>(); // 自一层的链表要收集好，之后要加到大List里面
            for (int i = 1; i <= size; i++) {
                TreeNode curNode = queue.poll();
                curAns.add(curNode.val);
                if (curNode.left != null) {
                    queue.add(curNode.left);
                }
                if (curNode.right != null) {
                    queue.add(curNode.right);
                }
            }
            ans.add(curAns);
        }
        return ans;
    }

}
