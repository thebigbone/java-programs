import java.util.Scanner;

interface Property {
    void computePrice();
}

class Bunglow implements Property {
    String name;
    int constArea, landArea, result, landCost;

    Scanner scan = new Scanner(System.in);

    public void computePrice() {
        System.out.println("enter constArea: ");
        constArea = scan.nextInt();
        System.out.println("enter landArea: ");
        landArea = scan.nextInt();
        System.out.println("enter landcost: ");
        landCost = scan.nextInt();
        result = (constArea * 500) + (landArea * 200) + (landCost * 400);
        System.out.println("final cost is: " + result);
    }
}

class Flat implements Property {
    String name;
    int constArea, additional_cost, result;
    Scanner scan = new Scanner(System.in);

    public void computePrice() {
        System.out.println("enter constarea: ");
        constArea = scan.nextInt();
        additional_cost = 200000;
        result = (constArea * 500) + additional_cost;
        System.out.println("final cost is: " + result);
    }
}

class PropLand {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter a choice:\n 1. Bunglow \n 2. Flat ");
        int choice = scan.nextInt();
        if (choice == 1) {
            Bunglow b = new Bunglow();
            b.computePrice();
        } else {
            Flat f = new Flat();
            f.computePrice();
        }
    }
}