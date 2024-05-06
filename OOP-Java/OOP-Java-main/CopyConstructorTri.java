import java.util.Scanner;

class Triangle {
    private float base, height, area;

    public Triangle(float b, float h) {
        base = b;
        height = h;
        area = 0.5f * base * height;
    }

    public Triangle(Triangle t) {
        base = t.base;
        height = t.height;
        area = t.area;
    }

    public void displayArea() {
        System.out.println("The area of the triangle is: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base and height of the triangle: ");
        float b = scanner.nextFloat();
        float h = scanner.nextFloat();

        Triangle t1 = new Triangle(b, h);
        Triangle t2 = new Triangle(t1);
        t2.displayArea();
        
        scanner.close();
    }
}
