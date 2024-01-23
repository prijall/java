import java.util.Scanner;

public class DeleteElementFromArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);

        // Get 10 elements from the user
        System.out.println("Enter 10 elements for the array:");
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }

        // Displaying the original array
        System.out.println("Original Array:");
        displayArray(arr);

        // Get the position to delete from user
        System.out.print("Enter the position (0-9) to delete an element: ");
        int position = scanner.nextInt();

        // Check if the position is within the array's bounds
        if (position >= 0 && position < 10) {
            // Deleting the element at the specified position
            for (int i = position; i < 9; i++) {
                arr[i] = arr[i + 1];
            }
            arr[9] = 0; // Set the last element to 0 or you can set it to any default value

            // Displaying the updated array
            System.out.println("Array after deleting element at position " + position + ":");
            displayArray(arr);
        } else {
            System.out.println("Invalid position entered. Position should be between 0 and 9.");
        }

        scanner.close();
    }

    // Method to display the array
    public static void displayArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
