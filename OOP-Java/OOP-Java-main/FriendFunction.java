import java.util.Scanner;

class Sample {
    private int x, y;

    public Sample(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

public class Main {
    public static void mean(Sample s) {
        float mean = (s.getX() + s.getY()) / 2.0f;
        System.out.println("Mean value of x and y is: " + mean);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();
        System.out.print("Enter the value of y: ");
        int y = scanner.nextInt();
        Sample s = new Sample(x, y);
        mean(s);
        scanner.close();
    }
}
