package TascaS108Lambdas.dMonthsUsingReference;

import java.util.List;

public class Exercise4 {
    public static void main(String[] args) {
        List<String> months = List.of("January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December");

        months.forEach(System.out::println);
    }
}
