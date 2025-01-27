package problem1700_NumberOfStudentsUnableToEatLunch;

import java.util.*;

public class Solution {

    // Explicitly simulate the process using a queue for students and a stack for sandwiches.
    //Worst case has O(n²) time complexity
    public int countStudentsWorse(int[] students, int[] sandwiches) {

        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        int length = students.length;

        for(int i = 0; i < length; i++) {
            queue.add(students[i]);
            stack.push(sandwiches[length - i - 1]);
        }

        int count = 0;

        while(count < queue.size()) {
            if(Objects.equals(stack.peek(), queue.peek())) {
                stack.pop();
                queue.remove();
                count = 0;
            }
            else {
                int aux = queue.peek();
                queue.remove();
                queue.add(aux);
                count++;
            }
        }
        return queue.size();
    }

    // Count student preferences and compare against the sandwich stack.
    // Has O(n) time complexity
    public int countStudentsBetter(int[] students, int[] sandwiches) {
        int[] count = new int[2]; // count[0] for type 0, count[1] for type 1
        for (int student : students) {
            count[student]++;
        }

        for (int sandwich : sandwiches) {
            if (count[sandwich] == 0) break; // No students want this sandwich
            count[sandwich]--;
        }

        return count[0] + count[1]; // Remaining students who couldn't eat
    }
}
