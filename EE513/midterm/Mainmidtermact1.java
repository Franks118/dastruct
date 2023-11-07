import java.util.*;
//Franco Capangpangan
public class Mainmidtermact1{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        // Menu for operations
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at the beginning");
            System.out.println("2. Insert at the end");
            System.out.println("3. Insert at a specified position");
            System.out.println("4. Delete from the beginning");
            System.out.println("5. Delete from the end");
            System.out.println("6. Delete from a specified position");
            System.out.println("7. Display elements");
            System.out.println("0. Exit");
            
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert at the beginning: ");
                    int value = scanner.nextInt();
                    list.insertAtBeginning(value);
                    list.display();
                    break;
                case 2:
                    System.out.print("Enter value to insert at the end: ");
                    value = scanner.nextInt();
                    list.insertAtEnd(value);
                    list.display();
                    break;
                case 3:
                    System.out.print("Enter value to insert: ");
                    value = scanner.nextInt();
                    System.out.print("Enter position to insert at: ");
                    int position = scanner.nextInt();
                    list.insertAtPosition(value, position);
                    list.display();
                    break;
                case 4:
                    list.deleteFromBeginning();
                    list.display();
                    break;
                case 5:
                    list.deleteFromEnd();
                    list.display();
                    break;
                case 6:
                    System.out.print("Enter position to delete from: ");
                    position = scanner.nextInt();
                    list.deleteFromPosition(position);
                    list.display();
                    break;
                case 7:
                    list.display();
                    break;
                case 0:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}


class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    // Insertion at the beginning of the list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insertion at the end of the list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Insertion at a specified position of the list
    public void insertAtPosition(int data, int position) {
        if (position < 0) {
            System.out.println("Invalid position.");
            return;
        }
        if (position == 0) {
            insertAtBeginning(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        int currentPosition = 0;
        while (current != null && currentPosition < position - 1) {
            current = current.next;
            currentPosition++;
        }
        if (current == null) {
            System.out.println("Position out of range.");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    // Deletion from the beginning of the list
    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        head = head.next;
    }

    // Deletion from the end of the list
    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    // Deletion from a specified position of the list
    public void deleteFromPosition(int position) {
        if (head == null || position < 0) {
            System.out.println("List is empty or invalid position.");
            return;
        }
        if (position == 0) {
            head = head.next;
            return;
        }
        Node current = head;
        int currentPosition = 0;
        while (current != null && currentPosition < position - 1) {
            current = current.next;
            currentPosition++;
        }
        if (current == null || current.next == null) {
            System.out.println("Position out of range.");
            return;
        }
        current.next = current.next.next;
    }

    // Display the elements of the list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "  ");
            current = current.next;
        }
       
    }
}

