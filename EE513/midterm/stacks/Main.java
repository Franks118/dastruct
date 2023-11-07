import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private Node top;
    private int size;
    private int maxSize;

    public Stack(int maxSize) {
        this.top = null;
        this.size = 0;
        this.maxSize = maxSize;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == maxSize;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push more elements.");
        } else {
            Node newNode = new Node(data);
            if (isEmpty()) {
                top = newNode;
            } else {
                newNode.next = top;
                top = newNode;
            }
            size++;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty: "+-1);
            return -1; // Assuming -1 represents an empty stack
        } else {
            int poppedValue = top.data;
            top = top.next;
            size--;
            return poppedValue;
        }
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; // Assuming -1 represents an empty stack
        } else {
            return top.data;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        Node current = top;
        System.out.print("Stack: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the stack size: ");
        int maxSize = scanner.nextInt();
        Stack stack = new Stack(maxSize);

        while (true) {
            System.out.println("Stack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Top");
            System.out.println("4. Print");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (stack.isFull()) {
                        System.out.println("Stack is full. Cannot push more elements.");
                    } else {
                        System.out.print("Enter value to push: ");
                        int value = scanner.nextInt();
                        stack.push(value);
                    }
                    break;
                case 2:
                    int poppedValue = stack.pop();
                    if (poppedValue != -1) {
                        System.out.println("Popped value: " + poppedValue);
                    }
                    break;
                case 3:
                    int topValue = stack.top();
                    if (topValue != -1) {
                        System.out.println("Top value: " + topValue);
                    }
                    break;
                case 4:
                    stack.print();
                    break;
                case 5:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
