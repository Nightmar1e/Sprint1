package TascaS104Testing.Lvl1.Exercise2;

public class CalculoDni {
    private static final char[] DNI_LETTERS = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
            'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public static char calculateLetter(int dniNumber) {
        int remainder = dniNumber % 23;
        return DNI_LETTERS[remainder];
    }
}
