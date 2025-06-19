import java.util.Scanner;
class Bank {
    Scanner sc = new Scanner(System.in);
    private String name;
    private int accNo;
    private String accType;
    private long balance;
    Bank() {
        System.out.println("Enter Account holder name: ");
        name = sc.nextLine();
        System.out.println("Enter Account No: ");
        accNo = sc.nextInt();
        System.out.println("Enter Account type: ");
        accType = sc.next();
        System.out.println("Enter Initial Balance: ");
        balance = sc.nextLong();
    }
    void deposit() {
        System.out.println("Enter deposit Amount: ");
        int amount = sc.nextInt();
        balance += amount;
        System.out.println("Balance after deposit: " + balance);
    }
    void withdraw() {
        System.out.println("Enter Withdrawal Amount: ");
        int withdraw = sc.nextInt();
        if (balance > withdraw) {
            balance -= withdraw;
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
    void display() {
        System.out.printf("Name: %s Account No: %d Type: %s\n", name, accNo, accType);
        System.out.println("Balance: " + balance);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank obj = new Bank();
        boolean b = true;
        while (b) {
            System.out.println("Choose from Options\n1.Deposit\n2.Witdrawl\n3.Balance Enquiry\n4.Exit");
            int choice = sc.nextInt();
            if (choice == 1) {
                obj.deposit();
            } else if (choice == 2) {
                obj.withdraw();
            } else if (choice == 3) {
                obj.display();
            } else if (choice == 4) {
                b = false;
                System.out.println("Thanks for Banking with us");
            } else {
                System.out.println("Invalid input");
                b = false;
            }
        }
    }
}
