package TascaS108Lambdas.fSort;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exercise6 {
    public static void main(String[] args) {
        List<String> mixedList = new ArrayList<>(List.of("666", "45", "32000", "There", "Here", "Now", "Then", "Later", "Before", "After", "Up"));

        mixedList.sort(Comparator.comparingInt(String::length));
        System.out.println("Sorted by shortest to longest: " + mixedList);
    }
}

