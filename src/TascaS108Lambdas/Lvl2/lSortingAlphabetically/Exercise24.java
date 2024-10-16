package TascaS108Lambdas.Lvl2.lSortingAlphabetically;

import java.util.Comparator;
import java.util.List;

public class Exercise24 {

    public static void main(String[] args) {
        List<String> stringList = List.of("apple", "banana", "cherry", "1234", "4321", "elephant", "grape", "pear", "5", "45");


        List<String> sortedByFirstChar = stringList.stream()
                .sorted(Comparator.comparingInt(s -> s.charAt(0)))
                .toList();

        System.out.println("Sorted by first character:");
        sortedByFirstChar.forEach(System.out::println);

        List<String> sortedByE = stringList.stream()
                .sorted((s1, s2) -> {
                    boolean s1HasE = s1.contains("e");
                    boolean s2HasE = s2.contains("e");
                    return Boolean.compare(!s1HasE, !s2HasE);
                })
                .toList();

        System.out.println("\nSorted with 'e' first:");
        sortedByE.forEach(System.out::println);

        List<String> modifiedList = stringList.stream()
                .map(s -> s.contains("a") ? s.replace('a', '4') : s)
                .toList();

        System.out.println("\nModified list (replacing 'a' with '4'):");
        modifiedList.forEach(System.out::println);

        List<String> numericItems = stringList.stream()
                .filter(s -> s.matches("\\d+"))
                .toList();

        System.out.println("\nOnly numeric items:");
        numericItems.forEach(System.out::println);
    }
}
