package samplepakage;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        System.out.println("list = " + list);
        System.out.println("list.get(0)); = " + list.get(0));
        System.out.println("list.removeIf() = "
                + list.removeIf(p -> p % 2 != 0));
    }
}
