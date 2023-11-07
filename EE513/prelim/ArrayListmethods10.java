import java.util.*;
public class ArrayListmethods10 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("ArrayList Operations Menu:");
            System.out.println("1. Add an element");
            System.out.println("2. Remove an element");
            System.out.println("3. Get element at index");
            System.out.println("4. Check if empty");
            System.out.println("5. Get size");
            System.out.println("6. Search for an element");
            System.out.println("7. Display all elements");
            System.out.println("8. Clear the ArrayList");
            System.out.println("9. Sort the ArrayList");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter an integer to add: ");
                    int elementToAdd = scanner.nextInt();
                    arrayList.add(elementToAdd);
                    System.out.println("Element added.");
                    break;

                case 2:
                    if (!arrayList.isEmpty()) {
                        System.out.print("Enter the index to remove: ");
                        int indexToRemove = scanner.nextInt();
                        if (indexToRemove >= 0 && indexToRemove < arrayList.size()) {
                            arrayList.remove(indexToRemove);
                            System.out.println("Element removed.");
                        } else {
                            System.out.println("Invalid index.");
                        }
                    } else {
                        System.out.println("ArrayList is empty.");
                    }
                    break;

                case 3:
                    if (!arrayList.isEmpty()) {
                        System.out.print("Enter the index to retrieve: ");
                        int indexToGet = scanner.nextInt();
                        if (indexToGet >= 0 && indexToGet < arrayList.size()) {
                            int element = arrayList.get(indexToGet);
                            System.out.println("Element at index " + indexToGet + ": " + element);
                        } else {
                            System.out.println("Invalid index.");
                        }
                    } else {
                        System.out.println("ArrayList is empty.");
                    }
                    break;

                case 4:
                    if (arrayList.isEmpty()) {
                        System.out.println("ArrayList is empty.");
                    } else {
                        System.out.println("ArrayList is not empty.");
                    }
                    break;

                case 5:
                    System.out.println("Size of ArrayList: " + arrayList.size());
                    break;

                case 6:
                    System.out.print("Enter an element to search for: ");
                    int elementToSearch = scanner.nextInt();
                    if (arrayList.contains(elementToSearch)) {
                        System.out.println("Element found in ArrayList.");
                    } else {
                        System.out.println("Element not found in ArrayList.");
                    }
                    break;

                case 7:
                    System.out.println("Elements in ArrayList: " + arrayList);
                    break;

                case 8:
                    arrayList.clear();
                    System.out.println("ArrayList cleared.");
                    break;

                case 9:
                    arrayList.sort(null);
                    System.out.println("ArrayList sorted in ascending order.");
                    break;

                case 10:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 10);

 
    }
}
