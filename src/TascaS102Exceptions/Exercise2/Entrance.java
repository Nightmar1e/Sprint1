package TascaS102Exceptions.Exercise2;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrance {
    private static Scanner scanner = new Scanner(System.in);

    public static byte readByte(String message) {
        while (true) {
            try {
                System.out.print(message);
                return scanner.nextByte();
            } catch (InputMismatchException e) {
                System.out.println("Format error: please enter a byte value.");
                scanner.next();
            }
        }
    }

    public static int readInt(String message) {
        while (true) {
            try {
                System.out.print(message);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Format error: please enter an integer value.");
                scanner.next();
            }
        }
    }

    public static float readFloat(String message) {
        while (true) {
            try {
                System.out.print(message);
                return scanner.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Format error: please enter a float value.");
                scanner.next();
            }
        }
    }

    public static double readDouble(String message) {
        while (true) {
            try {
                System.out.print(message);
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Format error: please enter a double value.");
                scanner.next();
            }
        }
    }

    public static char readChar(String message) {
        while (true) {
            try {
                System.out.print(message);
                String input = scanner.next();
                if (input.length() != 1) {
                    throw new Exception("Error: please enter a single character.");
                }
                return input.charAt(0);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static String readString(String message) {
        System.out.print(message);
        return scanner.next();
    }

    public static boolean readYesNo(String message) {
        while (true) {
            try {
                System.out.print(message + " (y/n): ");
                String input = scanner.next().toLowerCase();
                if (input.equals("y")) {
                    return true;
                } else if (input.equals("n")) {
                    return false;
                } else {
                    throw new Exception("Error: please enter 'y' for yes or 'n' for no.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        byte age = Entrance.readByte("Enter your age: ");
        int year = Entrance.readInt("Enter your birth year: ");
        float height = Entrance.readFloat("Enter your height: ");
        double weight = Entrance.readDouble("Enter your weight: ");
        char initial = Entrance.readChar("Enter your initial: ");
        String name = Entrance.readString("Enter your name: ");
        boolean accept = Entrance.readYesNo("Do you accept the terms?");

        System.out.println("Age: " + age);
        System.out.println("Birth year: " + year);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Initial: " + initial);
        System.out.println("Name: " + name);
        System.out.println("Acceptance: " + (accept ? "Yes" : "No"));
    }
}
