public class Solution {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    //This method takes the root of a binary tree as input and returns the number of uni-value subtrees in the tree.
    public static int countUnivalSubtrees(TreeNode root) {
        int[] count = new int[1];
        isUnival(root, count);
        return count[0];
    }

    //This is a private helper method that takes a node in the binary tree and an integer array count as input, and returns a boolean value indicating whether the subtree rooted at the given node is a uni-value subtree.
    private static boolean isUnival(TreeNode node, int[] count) {
        if (node == null) {
            return true;
        }
        boolean left = isUnival(node.left, count);
        boolean right = isUnival(node.right, count);
        if (left && right && ((node.left == null || node.left.val == node.val) && (node.right == null || node.right.val == node.val))) {
            count[0]++;
            return true;
        }
        return false;
    }

}
