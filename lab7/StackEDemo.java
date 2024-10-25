package lab7;

import java.util.Stack;

public class StackEDemo {+
	public static void main(String[] args) {
        // Create a Stack
        Stack<Integer> stack = new Stack<>();

        // Push 10 elements onto the stack
        for (int i = 1; i <= 10; i++) {
            stack.push(i);
        }

        // Display the stack after pushing 10 elements
        System.out.println("Stack after pushing 10 elements: " + stack);

        // Remove (pop) 4 elements from the stack
        for (int i = 0; i < 4; i++) {
            if (!stack.isEmpty()) {
                stack.pop();
            }
        }

        // Display the stack after removing 4 elements
        System.out.println("Stack after removing 4 elements: " + stack);
    }

}
