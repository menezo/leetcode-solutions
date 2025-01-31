package problem0628_BaseballGame;

import java.util.Stack;

public class Solution {
    public int calPoints(String[] operations) {
        // Stack to track valid scores
        Stack<Integer> stack = new Stack<>();

        int number = 0, result = 0;

        for(String s : operations) {
            switch (s) {
                // Sum the last two scores and add to the stack
                case "+" -> {
                    number = stack.lastElement() + stack.elementAt(stack.size() - 2);
                    stack.push(number);
                    result += number;
                }
                // Double the last score and add to the stack
                case "D" -> {
                    number = stack.peek() * 2;
                    stack.push(number);
                    result += number;
                }
                // Remove the last score and subtract from total
                case "C" -> {
                    result -= stack.peek();
                    stack.pop();
                }
                // Convert string to integer and add to the stack
                default -> {
                    number = Integer.parseInt(s);
                    stack.push(number);
                    result += number;
                }
            }
        }
        return result;
    }
}
