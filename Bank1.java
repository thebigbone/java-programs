import java.util.Scanner;

class BankAccount {
    String depositer, acc_type;
    int acc_no, bal1;
    int bal2 = 0;

    Scanner scan = new Scanner(System.in);

    void createAcc() {
        System.out.println("enter your name: ");
        depositer = scan.nextLine();
        System.out.println("enter your acc_type: ");
        acc_type = scan.nextLine();
        System.out.println("enter acc_no: ");
        acc_no = scan.nextInt();
    }

    void deposit() {
        System.out.println("enter amount to deposit: ");
        bal1 = scan.nextInt();
        bal2 += bal1;

        System.out.println("you deposited: " + bal1);
    }

    void withdraw() {
        if (bal2 <= 500) {
            System.out.println("cant withdraw. get out.");
            System.exit(0);
        } else {
            System.out.println("enter amount to withdraw: ");
            int with = scan.nextInt();
            bal2 = bal2 - with;
            System.out.println("you withdraw'd: " + with);
            System.out.println("final balance: " + bal2);
        }
    }

}

public class Bank1 {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("enter a choice:\n 1. Create \n 2. Deposit \n 3. Withdraw \n");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    b.createAcc();
                    break;
                case 2:
                    b.deposit();
                    break;
                case 3:
                    b.withdraw();
                    break;
                default:
                    System.out.println("invalid input!");
            }
        }
    }
}