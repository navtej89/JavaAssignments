import java.util.Scanner;

class Triangle {
    private float base, height, area;

    public Triangle() {
        base = 0;
        height = 0;
        area = 0;
    }

    public void getDimensions() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        base = scanner.nextFloat();
        System.out.print("Enter the height of the triangle: ");
        height = scanner.nextFloat();
        scanner.close();
    }

    public void calculateArea() {
        area = 0.5f * base * height;
    }

    public void displayArea() {
        System.out.println("The area of the triangle is: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.getDimensions();
        t.calculateArea();
        t.displayArea();
    }
}
