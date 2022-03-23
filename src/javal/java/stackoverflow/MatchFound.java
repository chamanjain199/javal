package javal.java.stackoverflow;

import java.util.ArrayList;
import java.util.List;

public class MatchFound {
    public static void main(String[] args) {
        List<String> l1=new ArrayList();
        l1.add("A");
        l1.add("B");
        l1.add("C");

        List<String> l2=new ArrayList();
        l2.add("a");
        l2.add("T");
        l2.add("G");

        l1.removeAll(l2);
        System.out.println(l1);

    }
}
