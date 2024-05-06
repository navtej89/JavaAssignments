import java.util.Scanner;

class Operation {
    private int a, b;
    private int add, sub, mul;
    private float div;

    public void get() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first value: ");
        a = scanner.nextInt();
        System.out.print("Enter second value: ");
        b = scanner.nextInt();
    }

    public void sum() {
        add = a + b;
        System.out.println("Addition of two numbers: " + add);
    }

    public void difference() {
        sub = a - b;
        System.out.println("Subtraction of two numbers: " + sub);
    }

    public void product() {
        mul = a * b;
        System.out.println("Product of two numbers: " + mul);
    }

    public void division() {
        div = (float) a / b;
        System.out.println("Division of two numbers: " + div);
    }
}

public class Main {
    public static void main(String[] args) {
        Operation s = new Operation();
        s.get();
        s.sum();
        s.difference();
        s.product();
        s.division();
    }
}
