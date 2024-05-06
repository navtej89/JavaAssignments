import java.util.Scanner;

public class Main {
    public static int calculateSum(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        }
        return arr[n - 1] + calculateSum(arr, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[100];
        int n, sum = 0;

        System.out.print("Enter size of array: ");
        n = scanner.nextInt();

        System.out.print("Enter the elements for array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        sum = calculateSum(arr, n);
        System.out.println("The sum of the elements is: " + sum);
    }
}
