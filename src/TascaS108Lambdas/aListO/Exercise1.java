package TascaS108Lambdas.aListO;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise1 {

    // in this case, we are using the map method to convert all the strings to lowercase
    public static List<String> filterStringsWithO(List<String> strings) {
        return strings.stream()
                .map(String::toLowerCase)
                .filter(s -> s.contains("o"))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> strings = List.of("Walid", "Wood", "Joint", "Vodka", "VODKA", "Weed", "Cocaine", "Cannabis", "Marijuana", "Hashish", "Opium", "Heroin");
        List<String> result = filterStringsWithO(strings);
        System.out.println("Strings that contain 'o': " + result);
    }
}
