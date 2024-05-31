import java.util.Stack;

public class Solution {
    // a public method named verifyPreorder that takes an array of integers named preorder as input and returns a boolean value
    public boolean verifyPreorder(int[] preorder) {
        // Create a new stack object that holds integers
        Stack<Integer> stack = new Stack<>();
        // Initialize the lowest value seen so far as the smallest possible integer value
        int low = Integer.MIN_VALUE;
        // Loop through each value in the preorder array
        for (int p : preorder) {
            // If the value is less than the lowest value seen so far, return false
            if (p < low) {
                return false;
            }
            // While the stack is not empty and the current value is greater than the top of the stack, pop the stack and update the lowest value seen so far
            while (!stack.empty() && p > stack.peek()) {
                low = stack.pop();
            }
            // Push the current value onto the stack
            stack.push(p);
        }
        // If the loop completes without returning false, the preorder array is valid
        return true;
    }
}
