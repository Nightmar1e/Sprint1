package TascaS105JavaUtils.Exercise2;

import java.io.File;
        import java.text.SimpleDateFormat;
        import java.util.Arrays;
        import java.util.Date;

public class Exercise2 {
    public void listDirectoryTree(String directoryPath) {
        File directory = new File(directoryPath);
        if (directory.exists() && directory.isDirectory()) {
            listDirectoryRecursive(directory, 0);
        } else {
            System.out.println("Invalid directory path.");
        }
    }

    private void listDirectoryRecursive(File directory, int level) {
        File[] files = directory.listFiles();
        if (files != null) {
            Arrays.sort(files);
            for (File file : files) {
                printFileInfo(file, level);
                if (file.isDirectory()) {
                    listDirectoryRecursive(file, level + 1);
                }
            }
        }
    }

    private void printFileInfo(File file, int level) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String type = file.isDirectory() ? "D" : "F";
        String modifiedDate = sdf.format(new Date(file.lastModified()));
        String indent = " ".repeat(level * 2);
        System.out.println(indent + type + " - " + file.getName() + " - Last modified: " + modifiedDate);
    }

    public static void main(String[] args) {
        Exercise2 lister = new Exercise2();
        lister.listDirectoryTree("Sprint1/src");
    }
}
