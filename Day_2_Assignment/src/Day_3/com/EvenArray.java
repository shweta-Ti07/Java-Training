package Day_3.com;

import java.util.Scanner;
public class EvenArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Even numbers are:");

        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
        sc.close();
    }
}
