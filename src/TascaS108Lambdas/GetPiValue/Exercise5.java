package TascaS108Lambdas.GetPiValue;

@FunctionalInterface
interface PiValue {
    double getPiValue();
}

public class Exercise5 {
    public static void main(String[] args) {
        PiValue pi = () -> 3.1415;
        System.out.println("Pi value: " + pi.getPiValue());
    }
}
