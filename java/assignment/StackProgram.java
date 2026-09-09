import java.util.Scanner;
import java.util.Stack;

public class StackProgram {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Stack<Integer> stack = null;

        int choice;

        do {
            System.out.println("\n===== STACK MENU =====");
            System.out.println("1. Create Stack");
            System.out.println("2. Push");
            System.out.println("3. Pop");
            System.out.println("4. Peek");
            System.out.println("5. Search");
            System.out.println("6. Check Empty");
            System.out.println("7. Display Stack");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    stack = new Stack<>();
                    System.out.println("Stack created successfully.");
                    break;

                case 2:
                    if (stack == null) {
                        System.out.println("Please create the stack first!");
                    } else {
                        System.out.print("Enter value to push: ");
                        int value = input.nextInt();
                        stack.push(value);
                        System.out.println(value + " pushed into stack.");
                    }
                    break;

                case 3:
                    if (stack == null) {
                        System.out.println("Please create the stack first!");
                    } else if (stack.empty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Popped element: " + stack.pop());
                    }
                    break;

                case 4:
                    if (stack == null) {
                        System.out.println("Please create the stack first!");
                    } else if (stack.empty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Top element: " + stack.peek());
                    }
                    break;

                case 5:
                    if (stack == null) {
                        System.out.println("Please create the stack first!");
                    } else if (stack.empty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.print("Enter element to search: ");
                        int key = input.nextInt();

                        int position = stack.search(key);

                        if (position == -1) {
                            System.out.println("Element not found.");
                        } else {
                            System.out.println("Element found at position " + position + " from the top.");
                        }
                    }
                    break;

                case 6:
                    if (stack == null) {
                        System.out.println("Please create the stack first!");
                    } else {
                        if (stack.empty()) {
                            System.out.println("Stack is empty.");
                        } else {
                            System.out.println("Stack is not empty.");
                        }
                    }
                    break;

               case 7:
                    if (stack == null) {
                        System.out.println("Please create the stack first!");
                    } else if (stack.empty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("\n      TOP");
                        System.out.println("   +-------+");

                        for (int i = stack.size() - 1; i >= 0; i--) {
                            System.out.printf("   |%7d|\n", stack.get(i));
                            System.out.println("   +-------+");
                        }

                      System.out.println("     BOTTOM");
                    }
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        input.close();
    }
}