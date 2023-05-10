import java.util.Scanner;

class Cricket {
    String name;
    int age;

    Scanner scan = new Scanner(System.in);

    void setdata() {
        System.out.println("enter your name: ");
        name = scan.nextLine();
        System.out.println("enter your age: ");
        age = scan.nextInt();
    }

    void display() {
        System.out.println("your name is: " + name);
        System.out.println("your age is: " + age);
    }
}

class Match extends Cricket {
    int no_odi, no_test;

    void setdata() {
        super.setdata();
        System.out.println("enter no_odi: ");
        no_odi = scan.nextInt();
        System.out.println("enter no_test: ");
        no_test = scan.nextInt();
    }

    void display() {
        super.display();
        System.out.println("no_odi is: " + no_odi);
        System.out.println("no_test is: " + no_test);
    }
}

class Cricket1 {
    public static void main(String[] args) {
        Match[] matches = new Match[5];
        for (int i = 0; i < 5; i++) {
            matches[i] = new Match();
            matches[i].setdata();
            matches[i].display();
        }
    }
}
