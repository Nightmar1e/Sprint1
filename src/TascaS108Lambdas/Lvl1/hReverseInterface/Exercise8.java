package TascaS108Lambdas.Lvl1.hReverseInterface;

@FunctionalInterface
interface StringReverser {
    String reverse(String input);
}

public class Exercise8 {
    public static void main(String[] args) {
        StringReverser reverser = (input) -> new StringBuilder(input).reverse().toString();

        String original = "Hello";
        String reversed = reverser.reverse(original);

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
