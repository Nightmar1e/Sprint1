package TascaS103JavaCollections.Exercise5;

import java.io.*;
import java.util.*;

public class MainApp {
    private static List<Person> personList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        loadPersonsFromCSV("Sprint1/src/TascaS103JavaCollections/FilterCSV/persons.csv");

        do {
            System.out.println("Menu:");
            System.out.println("1.- Introduir persona.");
            System.out.println("2.- Mostrar les persones ordenades per nom (A-Z).");
            System.out.println("3.- Mostrar les persones ordenades per nom (Z-A).");
            System.out.println("4.- Mostrar les persones ordenades per cognoms (A-Z).");
            System.out.println("5.- Mostrar les persones ordenades per cognoms (Z-A).");
            System.out.println("6.- Mostrar les persones ordenades per DNI (1-9).");
            System.out.println("7.- Mostrar les persones ordenades per DNI (9-1).");
            System.out.println("0.- Sortir.");
            System.out.print("Select an option: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    addPerson(scanner);
                    break;
                case 2:
                    sortBy("name", true);
                    break;
                case 3:
                    sortBy("name", false);
                    break;
                case 4:
                    sortBy("surname", true);
                    break;
                case 5:
                    sortBy("surname", false);
                    break;
                case 6:
                    sortBy("dni", true);
                    break;
                case 7:
                    sortBy("dni", false);
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (option != 0);
    }

    private static void addPerson(Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter surname: ");
        String surname = scanner.nextLine();
        System.out.print("Enter DNI: ");
        String dni = scanner.nextLine();

        personList.add(new Person(name, surname, dni));
        System.out.println("Person added successfully!");
    }

    private static void loadPersonsFromCSV(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                if (fields.length == 3) {
                    personList.add(new Person(fields[0].trim(), fields[1].trim(), fields[2].trim()));
                }
            }
            System.out.println("Loaded " + personList.size() + " persons from CSV.");
        } catch (IOException e) {
            System.out.println("Error reading CSV file: " + e.getMessage());
        }
    }

    private static void sortBy(String field, boolean ascending) {
        Comparator<Person> comparator = null;

        switch (field) {
            case "name":
                comparator = Comparator.comparing(Person::getName);
                break;
            case "surname":
                comparator = Comparator.comparing(Person::getSurname);
                break;
            case "dni":
                comparator = Comparator.comparing(Person::getDni);
                break;
        }

        if (comparator != null) {
            if (!ascending) {
                comparator = comparator.reversed();
            }
            Collections.sort(personList, comparator);
            displayPersons();
        }
    }

    private static void displayPersons() {
        System.out.printf("%-15s %-20s %-10s\n", "___Nom___", "____Cognoms___", "__NIF__");
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}

// to be added later on Monday 7