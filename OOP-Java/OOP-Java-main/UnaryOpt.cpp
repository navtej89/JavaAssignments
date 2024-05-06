import java.util.Scanner;

public class Sample {
    private int x, y;

    public Sample(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Sample preIncrement() {
        ++x;
        ++y;
        return this;
    }

    public Sample postIncrement() {
        Sample temp = new Sample(x, y);
        ++x;
        ++y;
        return temp;
    }

    public void display() {
        System.out.println("x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();
        System.out.print("Enter the value of y: ");
        int y = scanner.nextInt();

        Sample s = new Sample(x, y);
        System.out.println("Before overloading:");
        s.display();

        s.preIncrement();
        System.out.println("After pre-increment overloading:");
        s.display();

        Sample oldState = s.postIncrement();
        System.out.println("After post-increment overloading:");
        oldState.display();
        
        scanner.close();
    }
}
