class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true; // Both trees are empty
        }
        if (p == null || q == null) {
            return false; // One tree is empty, and the other is not
        }
        return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
