import java.util.Scanner;

class Bank {
    String bankName;
    long accNo;
    String typeOfAcc;
    float balance;
    int amount;

    public void getInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Bank Name : ");
        bankName = scanner.nextLine();
        System.out.println("Enter Account Number : ");
        accNo = scanner.nextLong();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter Type Of Account : ");
        typeOfAcc = scanner.nextLine();
        System.out.println("Enter Balance : ");
        balance = scanner.nextFloat();
        System.out.println("Enter Amount : ");
        amount = scanner.nextInt();
    }

    public void displayInfo() {
        System.out.println("Bank Name : " + bankName);
        System.out.println("Account Number : " + accNo);
        System.out.println("Type Of Account : " + typeOfAcc);
        System.out.println("Balance : " + balance);
        System.out.println("Amount you want to be credited or debited : " + amount);
    }

    public void credit() {
        float credit = balance + amount;
        System.out.println("Total amount after credited : " + credit);
    }

    public void debit() {
        if (balance > amount && balance > 2000) {
            System.out.println("You can withdraw the amount");
            float debit = balance - amount;
            System.out.println("Total balance after the withdraw : " + debit);
        } else {
            System.out.println("You have insufficient amount in your account");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.getInfo();
        b1.displayInfo();
        b1.credit();
        b1.debit();
    }
}
