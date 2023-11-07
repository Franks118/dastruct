import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    public void print() {
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public int top() {
        if (isEmpty()) {
            return -1;
        }
        return top.data;
    }
}

public class stacklinkedlist2 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);
         int choice = 0;
        do {
            System.out.println("MENU");
            System.out.println("[1] - isEmpty");
            System.out.println("[2] - Print");
            System.out.println("[3] - Push");
            System.out.println("[4] - Pop");
            System.out.println("[5] - Top");
            System.out.println("[0] - Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            

            switch (choice) {
                case 1:
                    System.out.println("Stack is empty: " + stack.isEmpty());
                    break;
                case 2:
                    System.out.print("Stack: ");
                    stack.print();
                    break;
                case 3:
                    System.out.print("Enter a value to push: ");
                    int valueToPush = scanner.nextInt();
                    stack.push(valueToPush);
                    break;
                case 4:
                    int poppedValue = stack.pop();
                    if (poppedValue != -1) {
                        System.out.println("Popped value: " + poppedValue);
                    } else {
                        System.out.println("Stack is empty. Cannot pop.");
                    }
                    break;
                case 5:
                    int topValue = stack.top();
                    if (topValue != -1) {
                        System.out.println("Top: " + topValue);
                    } else {
                        System.out.println("Stack is empty. -1");
                    }
                    break;
                    case 0:
                    System.out.println("BYEEE!!!!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
    }while(choice!=0);
}
}
