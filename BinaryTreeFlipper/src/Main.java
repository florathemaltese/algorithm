public class Main {
    public static void main(String[] args) {
        Solution.TreeNode root = new Solution.TreeNode(1);
        root.left = new Solution.TreeNode(2);
        root.right = new Solution.TreeNode(3);
        root.left.left = new Solution.TreeNode(4);
        root.left.right = new Solution.TreeNode(5);
        Solution.TreeNode node = Solution.turnOverTree(root);
        System.out.println(node.val);
        System.out.println(node.left.val);
        System.out.println(node.right.val);
        System.out.println(node.right.left.val);
        System.out.println(node.right.right.val);
    }}