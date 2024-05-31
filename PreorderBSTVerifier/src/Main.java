public class Main {
    public static void main(String[] args) {
        int[] preorder = {5, 2, 1, 3, 6};
        Solution solution = new Solution();
        boolean result = solution.verifyPreorder(preorder);
        System.out.println(result); // expected output: true
    }
}
