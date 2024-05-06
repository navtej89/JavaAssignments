import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        final int Size = 5;
        int[] arr = {1, 2, 3, 4, 5};
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the index to access in the array: ");
        int index = scanner.nextInt();
        
        try {
            if (index < 0 || index >= Size) {
                throw new IndexOutOfBoundsException();
            }
            int value = arr[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception: index out of bound");
        } finally {
            scanner.close();
        }
    }
}
