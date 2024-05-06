import java.util.Scanner;

class A {
    protected int x;

    public void getX() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of x: ");
        x = scanner.nextInt();
        scanner.close(); // Close scanner to free resources
    }
}

class B {
    protected int y;

    public void getY() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of y: ");
        y = scanner.nextInt();
        scanner.close(); // Close scanner to free resources
    }
}

class C extends A, B {
    public void product() {
        System.out.println("Product = " + (x * y));
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        C obj = new C();
        obj.getX();
        obj.getY();
        obj.product();
    }
}
