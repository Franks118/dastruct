import java.util.*;

public class mainArray {
    static Scanner s = new Scanner(System.in);
    int[] info;
    int size;
    int rear = 0;

    public static void main(String[] args) {
        mainArray UI = new mainArray();
        UI.setSize();
        int choice;
        do {
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
                   UI.removeQueue(); 
                    break;
                case 5:
                     UI.Front(); 
                    break;
                case 6:
                  UI.Back();

                    break;
                case 7:
                    UI.print();
                    break;
                case 0:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 0);
    }

    public void setSize() {
        System.out.println("Set size of Queue: ");
        size = s.nextInt();
        info = new int[size];
    }

    public void initializeQueue() {
        for (int i = 0; i < size; i++) {
            info[i] = 0;
        }
        rear = 0;
    }
public void isFullQueue() {
        if(rear >= size){
        System.out.println("its Full.");
        }else{
         System.out.println("it is not Full.");
        }
            }

    public void isEmptyQueue() {
        if (info[0] == 0) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue is not empty");
        }
    }
//To reveal the first Element
    public void Front() {
        if (info[0] == 0) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Front is " + info[0]);
        }
    }
//To reveal the last Element
    public void Back() {
        if (info[0] == 0) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Back is " + info[rear - 1]);
        }
    }
//Add Queue
    public void addQueue() {
        int add;
        System.out.println("Enter Element to add ");
        add = s.nextInt();
        if (rear == size) {
            System.out.println("Queue is full.");
        } else {
            info[rear] = add;
            rear++;
        }
    }
//remove queue
    public void removeQueue() {
        if (info[0] == 0) {
            System.out.println("Queue is empty.");
        } else if (info[1] == 0) {
            info[0] = 0;
            rear--;
        } else {
            for (int i = 1; i < size; i++) {
                info[i - 1] = info[i];
            }
            info[rear - 1] = 0;
            rear--;
        }
    }

    public void print() {
        if (info[0] == 0) {
            System.out.println("Queue is empty.");
        } else {System.out.print("Elements: \n");
            for (int i = 0; i < rear; i++) {
                System.out.print(info[i]+" ");
            }
        }
  System.out.println(" ");
    }
}
