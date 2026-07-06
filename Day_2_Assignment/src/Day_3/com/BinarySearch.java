package Day_3.com;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in sorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        int low = 0;
        int high = n - 1;
        boolean found = false;

        // Step 5: Binary Search
        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == key) {

                System.out.println("Element found at index: " + mid);
                found = true;
                break;

            } else if (arr[mid] < key) {

                low = mid + 1;

            } else {

                high = mid - 1;

            }
        }

        if (!found) {
            System.out.println("Element not found.");
        }

        sc.close();
    }
}