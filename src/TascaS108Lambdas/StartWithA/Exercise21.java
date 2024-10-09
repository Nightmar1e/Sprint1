package TascaS108Lambdas.StartWithA;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise21 {

    public static List<String> filterStrartsWithA(List<String> strings) {
        return strings.stream()
//                .map(String::toUpperCase)
                .filter(s -> s.startsWith("A") && s.length() == 3)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> strings = List.of("Apple", "Ant", "Ace",  "Art", "Age", "Adventure", "Antenna", "Act", "Arc","Atlas", "Architect", "Aquarium", "Alarm", "Amazon", "Ash", "Ape", "Axe", "Arrow", "Artist", "Asia", "Astronaut", "Avocado", "August", "Africa", "Atlantic Ocean", "Alps", "Antarctica", "Albania", "Argentina", "Armenia", "Andorra", "Angola", "Antigua and Barbuda", "Australia", "Austria", "Azerbaijan");
        List<String> result = filterStrartsWithA(strings);
        System.out.println("Strings that contain 'A': " + result);
    }
}
