package newbie0.class06;

/**
 * @author Kiteye
 * @date 2/7/2022
 * @Description  判断两颗树是否结构相同
 *
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 */

public class Same_tree {
    class TreeNode {
        public TreeNode left;
        public TreeNode right;
        public int value;

    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        // ^ 这句话的意思是 如果p为空，q不为空，或者p不为空，q为空。
        if (p == null ^ q == null){
            return false;
        }
        if(p == null && q == null){
            return true;
        }

        // 都不为空
        return p.value == q.value && isSameTree(p.left, q.left) && isSameTree(p.right,q.right);
    }
}
