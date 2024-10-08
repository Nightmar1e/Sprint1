package TascaS103JavaCollections.Capitals;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Capital {

    private static final int NUMBER_OF_QUESTIONS = 50;
    private static Map<String, String> countryCapitalMap = new HashMap<>();

    public static void main(String[] args) {
        readCountriesFromFile();

        Scanner scanner = new Scanner(System.in);
        String userName;
        do {
            System.out.print("Enter your name: ");
            userName = scanner.nextLine();
        } while (userName.trim().isEmpty());  // scanner would keep asking for a name if not entered
        int score = 0;

        List<String> countries = new ArrayList<>(countryCapitalMap.keySet());
        Collections.shuffle(countries);

        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            String country = countries.get(i);
            String correctCapital = countryCapitalMap.get(country);
            System.out.printf("What is the capital of %s? ", country);
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(correctCapital)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.printf("Wrong! The capital of %s is %s.%n", country, correctCapital);
            }
        }

        saveScore(userName, score);

        System.out.println("Your score: " + score + "/" + NUMBER_OF_QUESTIONS);
    }

    private static void readCountriesFromFile() {
        try {
            Path filePath = Paths.get("Sprint1/src/TascaS103JavaCollections/Capitals/countries.txt");
            List<String> lines = Files.readAllLines(filePath);

            for (String line : lines) {
                String[] parts = line.split(" ");
                if (parts.length >= 2) {
                    String country = parts[0].replace("_", " ");
                    String capital = parts[1];
                    countryCapitalMap.put(country, capital);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    private static void saveScore(String userName, int score) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Sprint1/src/TascaS103JavaCollections/Capitals/ranking.txt", true))) {
            writer.write(userName + ": " + score);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Error writing to ranking file: " + e.getMessage());
        }
    }
}
