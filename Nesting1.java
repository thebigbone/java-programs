class Nesting {
    int hello = 10;

    void test() {
        System.out.println("this is a test func");
        Inner i = new Inner();
        i.display();
        System.out.println(i.ie);
    }

    class Inner {
        int ie = 10;

        void display() {
            System.out.println("this is display");
        }
    }
}

class Nesting1 {
    public static void main(String[] args) {
        Nesting n = new Nesting();
        n.test();
    }
}