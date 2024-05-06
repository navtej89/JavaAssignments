import java.util.Scanner;

public class aos {
    public static void area(int a) {
        int area = a * a;
        System.out.println(area + "=area");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side: ");
        int side = scanner.nextInt();
        area(side);
        scanner.close();
    }
}
