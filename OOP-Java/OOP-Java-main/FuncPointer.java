import java.util.Scanner;

interface MathOperation {
    int operate(int a, int b);
}

public class Main {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MathOperation funcPtr;

        funcPtr = Main::add;
        System.out.print("Enter 1st integers: ");
        int a = scanner.nextInt();
        System.out.print("Enter 2nd integers: ");
        int b = scanner.nextInt();
        System.out.println("Addition: " + funcPtr.operate(a, b));

        funcPtr = Main::subtract;
        System.out.print("Enter 1st integers: ");
        a = scanner.nextInt();
        System.out.print("Enter 2nd integers: ");
        b = scanner.nextInt();
        System.out.println("Subtraction: " + funcPtr.operate(a, b));
    }
}
