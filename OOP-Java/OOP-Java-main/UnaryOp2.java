import java.util.Scanner;

class Sample {
    private int x, y;

    public Sample(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Sample preDecrement() {
        --x;
        --y;
        return this;
    }

    public Sample postDecrement() {
        Sample temp = new Sample(x, y);
        --x;
        --y;
        return temp;
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

        s.preDecrement();
        System.out.println("After pre-decrement overloading:");
        s.display();

        s = s.postDecrement();
        System.out.println("After post-decrement overloading:");
        s.display();

        scanner.close();
    }
}
