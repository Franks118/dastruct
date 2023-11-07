import java.util.Scanner;

public class StackAsArray {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public StackAsArray(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push.");
        } else {
            stackArray[++top] = value;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty: "+true);
            return -1; // Return a default value indicating failure
        } else {
            return stackArray[top--];
        }
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is empty: "+true);
            
            return -1; 
        } else {
            return stackArray[top];
        }
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter stack size: ");
        int size = scanner.nextInt();
        StackAsArray stack = new StackAsArray(size);

        while (true) {
            System.out.println("\nMenu");
            System.out.println("[1] - isEmpty");
            System.out.println("[2] - Print");
            System.out.println("[3] - Push");
            System.out.println("[4] - Pop");
            System.out.println("[5] - Top");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Is empty: " + stack.isEmpty());
                    break;
                case 2:
                    stack.printStack();
                    break;
                case 3:
                    System.out.print("Enter value to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 4:
                    int poppedValue = stack.pop();
                    if (poppedValue != -1) {
                        System.out.println("Popped: " + poppedValue);
                    }
                    break;
                case 5:
                    int topValue = stack.top();
                    if (topValue != -1) {
                        System.out.println("Top element: " + topValue);
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}