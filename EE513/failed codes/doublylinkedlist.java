import java.util.*;
public class doublylinkedlist{
static Scanner scanner = new Scanner(System.in);
public static void main(String[]args){
LinkedList list = new LinkedList();
System.out.print("Enter value to insert at the beginning: ");
                    int value = scanner.nextInt();
                    list.insertAtBeginning(value);
                    list.display();


}

 // Insertion at the beginning of the list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

}