import java.io.*;
import java.util.*;
import org.apache.commons.codec.digest.DigestUtils;

class Hashes {  
    String input, salt, result;
    int choice;
    
    Scanner scan = new Scanner(System.in);        

    void get_string() {
        try {
            System.out.println("Enter a string: ");
            input = scan.nextLine();
            if (input.isEmpty() || input.equals(" ")) {
                System.out.println("Invalid input! Please enter a valid string.");
                System.exit(0);
            }
        throw new InputMismatchException();
        }
        
        catch (InputMismatchException e) {
            System.out.println("Input mismatch! The following error occurred: " + e);
        }
    } 

    void md5_salt() {
            System.out.println("Enter salt: ");
            salt = scan.nextLine();
            result = DigestUtils.md5Hex(input + salt);
            System.out.println("Salted MD5: " + result);
    }
    
    void md5() {
        result = DigestUtils.md5Hex(input);
        System.out.println("Unsalted MD5: " + result);
    }
    
    void sha256() {
        result = DigestUtils.sha256Hex(input);
        System.out.println("SHA256: " + result);
    }
}

public class Hashing {
    public static void main(String[] args) {
        Hashes h = new Hashes();
        int choose;
        Scanner scan = new Scanner(System.in);        
        h.get_string();
        System.out.println("Enter which hashing algorithm to use:\n 1. MD5\n 2. SHA256\n");
        choose = scan.nextInt();

        switch(choose) {
            case 1:
                System.out.println("Salt (1) or No salt (2): ");
                int ch = scan.nextInt();
                switch(ch) {
                    case 1:
                        h.md5_salt();
                        break;
                    case 2:
                        h.md5();
                        break;
                    default:
                        System.out.println("Something went wrong! Please try again.");
                }
                break;
            case 2:
                h.sha256();
                break;
            default:
                System.out.println("Something went wrong! Please try again.");
        }
    }
}