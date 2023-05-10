import java.util.ArrayList;
import java.util.Iterator;

public class arrays {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();

        arr.add("boo");
        arr.add("yahh");
        arr.add("nnooo");

        Iterator itr = arr.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
