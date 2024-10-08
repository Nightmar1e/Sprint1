package TascaS108Lambdas.ListO;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise1 {
    public static List<String> filterStringsWithO(List<String> strings) {
        return strings.stream()
                .filter(s -> s.contains("o"))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> strings = List.of("Walid", "Wood", "Joint", "Weed", "Cocaine", "Cannabis", "Marijuana", "Hashish", "Opium", "Heroin");
        List<String> result = filterStringsWithO(strings);
        System.out.println("Strings that contain 'o': " + result);
    }
}
