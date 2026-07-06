package Day_3.com;
import java.util.Scanner;

public class SecondMaxArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {

                secondMax = max;
                max = arr[i];

            }
            else if (arr[i] > secondMax && arr[i] != max) {

                secondMax = arr[i];

            }
        }

        if (secondMax == Integer.MIN_VALUE) {

            System.out.println("Second largest element does not exist.");

        } else {

            System.out.println("Second Largest = " + secondMax);
        }

        sc.close();
    }
}