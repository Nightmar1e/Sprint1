package TascaS106Genèrics.bPerson;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Dilaw", "Wal", 30);

        GenericMethods gm = new GenericMethods();

        System.out.println("Test 1:");
        gm.printArguments(person, "Heyy!", 100);

        System.out.println("\nTest 2:");
        gm.printArguments(3.14, person, 'A');

        System.out.println("\nTest 3:");
        gm.printArguments("Generic Test", true, 42L);
    }
}
