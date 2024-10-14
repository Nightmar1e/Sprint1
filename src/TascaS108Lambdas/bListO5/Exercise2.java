package TascaS108Lambdas.bListO5;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {
    // in this case, we are not using to lowercase method
    public static List<String> filterStringsWithOAndLength(List<String> strings) {
        return strings.stream()
                .filter(s -> s.contains("o") && s.length() > 5)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> strings = List.of("Walid", "Wood", "Joint", "Vodka", "VODKA", "Weed", "Cocaine", "Cannabis", "Marijuana", "Hashish", "Opium", "Heroin");
        List<String> result = filterStringsWithOAndLength(strings);
        System.out.println("Strings that contain 'o' and have more than 5 letters: " + result);
    }
}
