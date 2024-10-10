package TascaS108Lambdas.Operations;

@FunctionalInterface
interface Exercise232 {
    float operation(float a, float b);
    }

public class Exercise23 {
        public static void main(String[] args) {
            Exercise232 addition = (a, b) -> a + b;

            Exercise232 subtraction = (a, b) -> a - b;

            Exercise232 multiplication = (a, b) -> a * b;

            Exercise232 division = (a, b) -> {
                if (b != 0) {
                    return a / b;
                } else {
                    throw new ArithmeticException("🤡 Cannot divide by zero 🤡");
                }
            };

            float num1 = 10.5f;
            float num2 = 2.5f;

            System.out.println("Addition: " + addition.operation(num1, num2));
            System.out.println("Subtraction: " + subtraction.operation(num1, num2));
            System.out.println("Multiplication: " + multiplication.operation(num1, num2));
            System.out.println("Division: " + division.operation(num1, num2));
        }
    }

