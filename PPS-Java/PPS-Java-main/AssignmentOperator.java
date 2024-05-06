import java.util.Scanner;

public class AssignmentOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;

        System.out.println("Enter a, b:");
        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.println("a=" + (a = b));
        System.out.println("a=" + (a += b));
        System.out.println("a=" + (a -= b));
        System.out.println("a=" + (a *= b));
        System.out.println("a=" + (a /= b));
        System.out.println("a=" + (a %= b));
    }
}
