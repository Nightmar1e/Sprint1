package TascaS103JavaCollections.List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);

        List<Integer> list2 = new ArrayList<>();

        ListIterator<Integer> listIterator = list1.listIterator(list1.size());

        while (listIterator.hasPrevious()) {
            list2.add(listIterator.previous());
        }

        System.out.println("First list (original): " + list1);
        System.out.println("Second list (reversed): " + list2);
    }
}
