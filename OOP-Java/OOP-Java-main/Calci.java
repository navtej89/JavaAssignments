import java.util.Scanner;

class Calci {
    public void getInfo() {
        Scanner scanner = new Scanner(System.in);
        int a, b, i;
        System.out.print("Enter Number 1 : ");
        a = scanner.nextInt();
        System.out.print("\nEnter Number 2 : ");
        b = scanner.nextInt();
        do {
            System.out.println("\nEnter 1 for 'Addition'");
            System.out.println("Enter 2 for 'Subtraction'");
            System.out.println("Enter 3 for 'Multiplication'");
            System.out.println("Enter 4 for 'Division'");
            System.out.println("Enter 0 to Exit");
            System.out.print("Enter your choice : ");
            i = scanner.nextInt();
            switch (i) {
                case 0:
                    break;
                case 1:
                    System.out.println("\n" + a + "+" + b + "=" + (a + b));
                    break;
                case 2:
                    System.out.println("\n" + a + "-" + b + "=" + (a - b));
                    break;
                case 3:
                    System.out.println("\n" + a + "*" + b + "=" + (a * b));
                    break;
                case 4:
                    if (b != 0) {
                        System.out.println("\n" + a + "/" + b + "=" + (a / b));
                    } else {
                        System.out.println("\nCannot divide by zero");
                    }
                    break;
                default:
                    System.out.println("\nEnter valid option");
            }
        } while (i != 0);
    }
}

public class Main {
    public static void main(String[] args) {
        Calci c1 = new Calci();
        c1.getInfo();
    }
}
