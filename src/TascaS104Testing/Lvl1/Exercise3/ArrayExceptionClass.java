package TascaS104Testing.Lvl1.Exercise3;


public class ArrayExceptionClass {
    public void triggerArrayIndexOutOfBoundsException() {
        int[] array = new int[5];
        int invalidElement = array[10];
    }
}
