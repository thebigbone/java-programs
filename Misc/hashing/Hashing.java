import java.io.*;
import java.util.*;
import org.apache.commons.codec.digest.DigestUtils;

public class Hashing {

    public static void main(String[] args) {
        String input, salt, result;
        int choice;

        Scanner scan = new Scanner(System.in);        
        try {
            System.out.println("Enter a string: ");
            input = scan.nextLine();
            if (input.isEmpty() || input.equals(" ")) {
                System.out.println("Invalid input! Please enter a valid string.");
                System.exit(0);
            }

            System.out.println("Choose the below 2 options:\n 1. Salt\n 2. No Salt\n");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter salt: ");
                    scan.nextLine();
                    salt = scan.nextLine();
                    result = DigestUtils.md5Hex(input + salt);
                    System.out.println("Salted MD5: " + result);
                    break;
            
                case 2:
                    result = DigestUtils.md5Hex(input);
                    System.out.println("Unsalted MD5: " + result);
                    break;

                default:
                    System.out.println("Something went wrong! Please try again.");
            
            throw new InputMismatchException();

            }
        }

        catch (InputMismatchException e) {
            System.out.println("Input mismatch! Following error occurred: " + e);
        }
    }
}