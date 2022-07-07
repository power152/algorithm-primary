package newbie0.class07;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Kiteye
 * @date 7/7/2022
 * @Description 二叉树的层序遍历 II 倒着遍历
 * <p>
 * 这里常见一个双端的链表，相当于我们往头结点插入小链表，然后组成一个大链表
 * 1、拿出此时队列的size，size又多少步骤2就进行多少回
 * 2、弹出结点有左现加左，有右再加右;
 * 3、往头结点插入，实现倒叙
 */

public class BinaryTreeLevelOrderTraversal2 {
    public static class TreeNode {
        public TreeNode left;
        public TreeNode right;
        public int val;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> curAns = new LinkedList<>();
            for (int i = 1; i <= size; i++){
                TreeNode curNode = queue.poll();
                curAns.add(curNode.val);
                if (curNode.left!=null){
                    queue.offer(curNode.left);
                }
                if (curNode.right!=null){
                    queue.offer(curNode.right);
                }
            }
            result.add(0,curAns);
        }
        return result;
    }
}
