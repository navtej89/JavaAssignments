import java.util.Scanner;

public class Triangle {
    private float base, height, area;

    public Triangle(float b, float h) {
        base = b;
        height = h;
        area = 0.5f * base * height;
    }

    public void displayArea() {
        System.out.println("The area of the triangle is: " + area);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base and height of the triangle: ");
        float b = scanner.nextFloat();
        float h = scanner.nextFloat();
        Triangle t = new Triangle(b, h);
        t.displayArea();
        scanner.close();
    }
}
