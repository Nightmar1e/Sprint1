package TascaS108Lambdas.Operations;

import java.util.Scanner;

@FunctionalInterface
interface Exercise232 {
    float operation(float a, float b);
}

public class Exercise23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float num1 = scanner.nextFloat();

        System.out.print("Enter the second number: ");
        float num2 = scanner.nextFloat();

        Exercise232 addition = (a, b) -> a + b;
        Exercise232 subtraction = (a, b) -> a - b;
        Exercise232 multiplication = (a, b) -> a * b;

        Exercise232 division = (a, b) -> {
            if (b != 0) {
                return a / b;
            } else {
                throw new ArithmeticException("🤡 Cannot divide by zero 🤡 \n YOU'RE BAD AT MATHS just saying!");
            }
        };

        System.out.println("Addition: " + addition.operation(num1, num2));
        System.out.println("Subtraction: " + subtraction.operation(num1, num2));
        System.out.println("Multiplication: " + multiplication.operation(num1, num2));

        try {
            System.out.println("Division: " + division.operation(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
