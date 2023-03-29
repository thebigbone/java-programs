import java.util.Scanner;

class NotEnoughMoneyException extends ArithmeticException {
    public NotEnoughMoneyException(String s) {
        super(s);
    }
}

class ZeroDeposit extends ArithmeticException {
    public ZeroDeposit(String s) {
        super(s);
    }
}
class Bank {
    int new_balance, old_balance = 0;
    int amount;

    Scanner scan = new Scanner(System.in);
    void deposit() {
        System.out.println("Enter the amount to deposit: ");
        amount = scan.nextInt();

        try {
            if (amount <= 0) {
                throw new ZeroDeposit("0 deposit not possible.");
            }
            else {
                System.out.println("You deposited " + amount + ".");
                new_balance = old_balance + amount;
                System.out.println("Your final balance is: " + new_balance + ".");
                System.out.println("Your old balance was: " + old_balance + ".");
            }
        }
        catch (ZeroDeposit e) {
            System.out.println("You cannot deposit 0 or less than 0.");
        }
    }

    void withdraw() {
        System.out.println("Enter the amount to withdraw: ");
        amount = scan.nextInt();
        
        try {
            if (new_balance <= 0) {
                throw new ArithmeticException();
            }

            if ((new_balance - amount) <= 500) {
                throw new NotEnoughMoneyException("Balance less than or equal to 500.");
            }
            else{
                new_balance = new_balance - amount;

                System.out.println("You withdrew " + amount + ".");
                System.out.println("Your final balance is: " + new_balance + ".");
                System.out.println("Your old balance was : " + old_balance + ".");
            }
        }
        catch (NotEnoughMoneyException e) {
            System.out.println("The following error occurred. Please try again." + e);
        }

        catch (ArithmeticException e) {
            System.out.println("The following error occurred: " + e + ". Please try again.");
        }

    }   
}

class Excphandling {
    public static void main(String []args) {
        Bank b = new Bank();
        b.deposit();
        b.withdraw();
    }
}