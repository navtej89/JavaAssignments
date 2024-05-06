import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        
        int n1 = 0, n2 = 1, n3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the range:");
        int num = scanner.nextInt();

        System.out.print(n1 + " " + n2 + " ");

        for (int i = 2; i < num; i++) {
            n3 = n1 + n2; 
            System.out.print(n3 + " "); 
            n1 = n2; 
            n2 = n3; 
        }
        scanner.close();
    }
}
