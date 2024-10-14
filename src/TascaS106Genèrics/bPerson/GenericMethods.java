package TascaS106Genèrics.bPerson;

public class GenericMethods {

    public <T1, T2, T3> void printArguments(T1 arg1, T2 arg2, T3 arg3) {
        System.out.println("Argument 1: " + arg1);
        System.out.println("Argument 2: " + arg2);
        System.out.println("Argument 3: " + arg3);
    }
}
