import java.util.Scanner;

class B {
    protected int x; // Protected to allow access in derived class

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of x: ");
        x = scanner.nextInt();
        scanner.close();  // Closing the scanner after use, should ideally be handled better in a real application
    }
}

class D extends B {
    private int y;

    public void readData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of y: ");
        y = scanner.nextInt();
        scanner.close();  // Closing the scanner after use
    }

    public void product() {
        System.out.println("Product = " + (x * y));
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        D obj = new D();
        obj.getData();
        obj.readData();
        obj.product();
    }
}
