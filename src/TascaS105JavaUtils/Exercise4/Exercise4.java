package TascaS105JavaUtils.Exercise4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise4 {

    public void readTextFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Exercise4 lister = new Exercise4();
        lister.readTextFile("Sprint1/src/TascaS105JavaUtils/Exercise3/output.txt");
    }
}
