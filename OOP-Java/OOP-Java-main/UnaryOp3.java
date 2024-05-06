import java.util.Scanner;

class Sample {
    private int x, y;

    public Sample(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void unaryMinus() {
        x = -x;
        y = -y;
    }

    public void display() {
        System.out.println("x = " + x + ", y = " + y);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();

        System.out.print("Enter the value of y: ");
        int y = scanner.nextInt();

        Sample s = new Sample(x, y);

        System.out.println("Before overloading:");
        s.display();

        s.unaryMinus();
        System.out.println("After overloading:");
        s.display();

        scanner.close();
    }
}
