
public class SolutionRunner {
    public static void main(String[] args) {
        // Create a binary tree with the given input
        Solution.TreeNode root = new Solution.TreeNode(5);
        root.left = new Solution.TreeNode(1);
        root.right = new Solution.TreeNode(5);
        root.left.left = new Solution.TreeNode(5);
        root.left.right = new Solution.TreeNode(5);
        root.right.right = new Solution.TreeNode(5);

        // Count the number of uni-value subtrees in the binary tree
        int count = Solution.countUnivalSubtrees(root);

        // Print the result
        System.out.println("Number of uni-value subtrees: " + count);
        }

    }
