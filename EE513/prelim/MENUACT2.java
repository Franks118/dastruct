import java.util.*;

public class MENUACT2{
static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[10];
        int size = 0;
//do while and switch case
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Populate Array");
            System.out.println("2. Print Array");
            System.out.println("3. Insert Element");
            System.out.println("4. Delete Element");
            System.out.println("5. Sort Array");
            System.out.println("6. Search Element");
            System.out.println("7. Exit");
            System.out.print("Enter your choice (1-7): ");
           
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    size = populateArray(arr);
                    break;

                case 2:
                    printArray(arr, size);
                    break;

                case 3:
                    size = insertElement(arr, size);
                    break;

                case 4:
                    size = deleteElement(arr, size);
                    break;

                case 5:
                    sortArray(arr, size);
                    break;

                case 6:
                    searchElement(arr, size);
                    break;

                case 7:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Error: Invalid choice. Please select a valid option (1-7).");
                    break;
            }
        } while (true);
    }
//populate
    private static int populateArray(int[] arr) {
       
        System.out.print("Enter the number of elements to populate: ");
        int size = scan.nextInt();
        if (size <= arr.length) {
            System.out.print("Enter elements: ");
     for (int i = 0; i < size; i++) {
        arr[i] = scan.nextInt();
    }
            System.out.println("Array populated successfully.");
   } else {
            System.out.println("Array size exceeds limit.");
        }
        return size;
    }
//print
    private static void printArray(int[] arr, int size) {
        if (size == 0) {
            System.out.println("Array is empty.");
        } else {
            System.out.println("Array elements:");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
//insert
    private static int insertElement(int[] arr, int size) {
     
        if (size < arr.length) {
            System.out.print("Enter the position to insert (0-" + (size - 1) + "): ");
            int pos = scan.nextInt();
            if (pos >= 0 && pos <= size) {
                System.out.print("Enter the element to insert: ");
                int element = scan.nextInt();
                for (int i = size; i > pos; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[pos] = element;
                size++;
                System.out.println("Element inserted successfully.");
                printArray(arr, size);
            } else {
                System.out.println("Invalid position.");
            }
        } else {
            System.out.println("Array is full. Cannot insert.");
        }
        return size;
    }
//delete
    private static int deleteElement(int[] arr, int size) {
       
        if (size > 0) {
            System.out.print("Enter the position to delete (0-" + (size - 1) + "): ");
            int pos = scan.nextInt();
            if (pos >= 0 && pos < size) {
   for (int i = pos; i < size - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                size--;
  System.out.println("Element deleted successfully.");
 printArray(arr, size);
            } else {
                System.out.println("Invalid position.");
            }
        } else {
            System.out.println("Array is empty. Nothing to delete.");
        }
        return size;
    }
//bubble sort
  static void sortArray(int[] arr, int size) {
    boolean swapped;
    for (int i = 0; i < size - 1; i++) {
        swapped = false;
        for (int j = 0; j < size - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
               
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                swapped = true;
            }
        }
        // If no two elements were swapped in the inner loop, the array is already sorted
        if (!swapped) {
            break;
        }
    }
    System.out.println("Array sorted using Bubble Sort.");
     printArray(arr, size);
}
//search
    private static void searchElement(int[] arr, int size) {
    System.out.print("Enter the element to search: ");
    int searchElement = scan.nextInt();
   
    boolean found = false;

    System.out.print("Element found at positions: ");
    for (int i = 0; i < size; i++) {
        if (arr[i] == searchElement) {
            System.out.print(i + "  ");
            found = true;
        }
    }
    

    if (!found) {
        System.out.println("Element not found.");
    }
    System.out.println();
}
}
