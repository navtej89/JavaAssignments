import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        int n, sum = 0;

        System.out.println("Enter size of array: ");
        n = scanner.nextInt();

        // Initialize array with n elements
        arr = new int[n];

        System.out.println("Enter elements in array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of all elements in an array = " + sum);
        scanner.close();
    }
}
