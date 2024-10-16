package TascaS108Lambdas.Lvl1.gInverseSort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exercise7 {

    public static void main(String[] args) {
        List<String> mixedList = new ArrayList<>(List.of("666", "45", "32000", "There", "Here", "Now", "Then", "Later", "Before", "After", "Up"));

        mixedList.sort(Comparator.comparingInt(String::length).reversed());
        System.out.println("Sorted by longest to shortest: " + mixedList);
    }
}
