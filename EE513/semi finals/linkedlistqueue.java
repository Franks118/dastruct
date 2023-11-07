import java.util.*;

public class linkedlistqueue {
    Node head;
    Node tail;
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        linkedlistqueue UI = new linkedlistqueue();
        int choice;
        do {
            System.out.println("Menu: ");
            System.out.println("1 - Queue Empty");
            System.out.println("2 - Queue is Full");
            System.out.println("3 - Enqueue");
            System.out.println("4 - Dequeue");
            System.out.println("5 - Front");
            System.out.println("6 - Back");
            System.out.println("7 - Print");         
            System.out.println("0 - Exit!!");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                     UI.isEmptyQueue();
                    break;
                case 2:
                    UI.isFullQueue();
                    break;
                case 3:
                   UI.addQueue();
                    break;
                case 4:
                   UI.deleteQueue();
                    break;
                case 5:
                     UI.Front(); 
                    break;
                case 6:
                     UI.Back();
                    break;
                case 7:
                    UI.TOprint();
                    break;
                 case 0:
                  System.out.print("Sayonara!!!");
                    break;
                     default:
                    System.out.println("Invalid Choice");


            }
        } while (choice != 0);
    }

  public void isFullQueue() { 
  if (head == null) {
            System.out.println("The Queue is empty.");
        } else {
        System.out.println("Twas Full.");
            }
            }

    public void isEmptyQueue() {
        if (head == null) {
            System.out.println("The Queue is empty.");
        } else {
            System.out.println("The Queue is not empty");
        }
    }

    public void Front() {
        if (head == null && tail == null) {
            System.out.println("The Queue is empty.");
        } else {
            System.out.println("The Front is " + head.info);
        }
    }

    public void Back() {
        if (head == null && tail == null) {
            System.out.println("The Queue is empty.");
        } else {
            System.out.println("The Back is " + tail.info);
        }
    }

    public void addQueue() {
        int info;
        System.out.println("The Enter Element to add");
        info = s.nextInt();
        Node newNode = new Node(info);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
    }

    public void deleteQueue() {
        if (head == null) {
            System.out.println("The Queue is empty");
        } else {
            head = head.next;
        }
    }

    public void TOprint() {

        Node temp = head;
        if (head == null) {
            System.out.println("The Queue is empty");
        } else {
         System.out.print("The Elements: \n");
            while (temp != null) {
                System.out.print(temp.info+" ");
                
                temp = temp.next;
            }
        }
   System.out.print("\n"); }
}
