package TascaS108Lambdas.cMonths;


import java.util.List;

public class Exercise3 {
    public static void main(String[] args) {
        List<String> months = List.of("January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December");

        months.forEach(month -> System.out.println(month));
    }
}
