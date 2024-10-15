package TascaS105JavaUtils.Exercise6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Properties;

public class Exercise6 {
    private String directoryPath;
    private String outputFilePath;

    public void loadConfig() {
        Properties properties = new Properties();
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties")) {
            if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
                return;
            }
            properties.load(input);

            this.directoryPath = properties.getProperty("directoryPath");
            this.outputFilePath = properties.getProperty("outputFilePath");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void listDirectoryTreeToFile() {
        File directory = new File(directoryPath);
        try (FileWriter writer = new FileWriter(outputFilePath)) {
            if (directory.exists() && directory.isDirectory()) {
                listDirectoryRecursiveToFile(directory, 0, writer);
            } else {
                writer.write("Invalid directory path.\n");
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    private void listDirectoryRecursiveToFile(File directory, int level, FileWriter writer) throws IOException {
        File[] files = directory.listFiles();
        if (files != null) {
            Arrays.sort(files);
            for (File file : files) {
                writeFileInfoToFile(file, level, writer);
                if (file.isDirectory()) {
                    listDirectoryRecursiveToFile(file, level + 1, writer);
                }
            }
        }
    }

    private void writeFileInfoToFile(File file, int level, FileWriter writer) throws IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String type = file.isDirectory() ? "D" : "F";
        String modifiedDate = sdf.format(new Date(file.lastModified()));
        String indent = " ".repeat(level * 2);
        writer.write(indent + type + " - " + file.getName() + " - Last modified: " + modifiedDate + "\n");
    }

    public static void main(String[] args) {
        Exercise6 lister = new Exercise6();
        lister.loadConfig();
        lister.listDirectoryTreeToFile();
    }
}
