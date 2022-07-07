package newbie0.class07;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Kiteye
 * @date 7/7/2022
 * @Description 路径总和升级版
 */

public class Path_Sum2 {
    public static class TreeNode {
        public TreeNode right;
        public TreeNode left;
        public int val;

        public TreeNode(int val) {
            this.val = val;
        }
    }


    // List 是列表
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        ArrayList<Integer> path = new ArrayList<>();
        process(root,path,0,targetSum,result);
        return result;
    }

    /**
     * @param root   根节点
     * @param path   统计的路径
     * @param preSum 前缀树的和
     * @param sum    目标和
     * @param result 随后总的路径放在一个链表中
     */
    public static void process(TreeNode root, List<Integer> path, int preSum, int sum, List<List<Integer>> result) {
        if (root.left == null && root.right == null) {
            if (preSum + root.val == sum) {
                path.add(root.val);
                result.add(copy(path));
                // 递归回去之后要 -1；
                path.remove(path.size() - 1);
            }
            return;
        }
        // root 非叶子结点
        path.add(root.val);
        preSum += root.val;
        if (root.left != null) {
            process(root.left, path, preSum, sum, result);
        }
        if (root.right != null) {
            process(root.right, path, preSum, sum, result);
        }
        path.remove(path.size() - 1);
    }


    public static List<Integer> copy(List<Integer> path) {
        List<Integer> ans = new ArrayList<>();
        for (Integer num : path) {
            ans.add(num);
        }
        return ans;
    }
}
