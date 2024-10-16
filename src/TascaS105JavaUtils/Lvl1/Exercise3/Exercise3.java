package TascaS105JavaUtils.Lvl1.Exercise3;


import java.io.File;
        import java.io.FileWriter;
        import java.io.IOException;
        import java.text.SimpleDateFormat;
        import java.util.Arrays;
        import java.util.Date;

public class Exercise3 {
    public void listDirectoryTreeToFile(String directoryPath, String outputFilePath) {
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
        Exercise3 lister = new Exercise3();
        lister.listDirectoryTreeToFile("Sprint1/src", "Sprint1/src/TascaS105JavaUtils/Exercise3/output.txt");
    }
}
