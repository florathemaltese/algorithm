// Define a Solution class
public class Solution {
    // Define a TreeNode class
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    // Define a static method that performs a tree inversion and returns the new root
    static TreeNode turnOverTree(TreeNode root) {
        TreeNode newRoot = root;
        // Find the leftmost node (the new root after the inversion)
        while (newRoot.left != null) {
            newRoot = newRoot.left;
        }
        // Perform the tree inversion
        turnOverAction(root);
        // Return the new root
        return newRoot;
    }

    // Define a static method that performs the tree inversion recursively
    static void turnOverAction(TreeNode root) {
        // If the root node does not have a left or right child, return
        if (root.left == null || root.right == null) {
            return;
        }
        // Store the left and right child nodes
        TreeNode left = root.left;
        TreeNode right = root.right;
        // Recursively invert the left and right subtrees
        turnOverAction(root.left);
        turnOverAction(root.right);
        // Set the root node's left and right child nodes to null
        root.left = null;
        root.right = null;
        // Invert the left and right child nodes
        left.left = right;
        left.right = root;
        right.left = null;
        right.right = null;
    }
}

