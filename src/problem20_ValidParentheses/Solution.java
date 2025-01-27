package problem20_ValidParentheses;
import java.util.Stack;

public class Solution {

    public static boolean isValid(String s) {
        // Initialize stack to track open brackets
        Stack<Character> stack = new Stack<>();

        // Iterate through each character
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);  // Adds open brackets onto the stack
            } else {
                // If stack is empty, there's no matching open bracket for the current close bracket
                if (stack.isEmpty()) {
                    return false;
                }
                // Check if the top of the stack matches the expected open bracket
                if ((ch == ')' && stack.peek() != '(') ||
                        (ch == ']' && stack.peek() != '[') ||
                        (ch == '}' && stack.peek() != '{')) {
                    return false;
                }
                stack.pop();  // Remove the matched open bracket from the stack
            }
        }
        // If stack is empty, all brackets were matched correctly
        return stack.isEmpty();
    }
}

