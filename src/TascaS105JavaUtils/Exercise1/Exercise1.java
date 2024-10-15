package TascaS105JavaUtils.Exercise1;

import java.io.File;
import java.util.Arrays;

public class Exercise1 {
    public void listDirectoryAlphabetically(String directoryPath) {
        File directory = new File(directoryPath);
        if (directory.isDirectory()) {
            String[] files = directory.list();
            if (files != null) {
                Arrays.sort(files);
                for (String file : files) {
                    System.out.println(file);
                }
            } else {
                System.out.println("The directory is empty or inaccessible.");
            }
        } else {
            System.out.println("The provided path is not a directory.");
        }
    }

    public static void main(String[] args) {
        Exercise1 lister = new Exercise1();
        lister.listDirectoryAlphabetically("Sprint1/src");
    }
}
