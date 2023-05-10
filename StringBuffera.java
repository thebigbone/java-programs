import java.io.*;

class StringBuffera {
    public static void main(String[] args) {
        String hello = "hi there!";
        System.out.println(hello);

        StringBuffer hi = new StringBuffer("hi ");
        hi.append("hi there!");
        System.out.println(hi);
    }
}