package TascaS106Genèrics.NoGenericMethods;

public class NoGenericMethodsTest {
    public static void main(String[] args) {
        NoGenericMethods test1 = new NoGenericMethods("1", "2", "3");
        NoGenericMethods test2 = new NoGenericMethods("3", "1", "2");
        NoGenericMethods test3 = new NoGenericMethods("2", "3", "1");

        System.out.println("Test1: ");
        test1.displayArguments();

        System.out.println("\nTest2: ");
        test2.displayArguments();

        System.out.println("\nTest3: ");
        test3.displayArguments();
    }
}

