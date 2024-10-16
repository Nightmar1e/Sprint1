package TascaS105JavaUtils.Lvl1.Exercise5;

import java.io.*;

public class Exercise5 implements Serializable {

    private String directoryName;

    public Exercise5(String directoryName) {
        this.directoryName = directoryName;
    }

    public static void serializeObject(String filePath, Exercise5 obj) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))) {
            out.writeObject(obj);
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            System.out.println("Error serializing object: " + e.getMessage());
        }
    }

    public static Exercise5 deserializeObject(String filePath) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))) {
            Exercise5 obj = (Exercise5) in.readObject();
            System.out.println("Object deserialized successfully.");
            return obj;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error deserializing object: " + e.getMessage());
            return null;
        }
    }

    public String getDirectoryName() {
        return directoryName;
    }

    public static void main(String[] args) {
        Exercise5 lister = new Exercise5("MyDirectory");

        serializeObject("Sprint1/src/TascaS105JavaUtils/Exercise5/exercise5.ser", lister);

        Exercise5 deserializedLister = deserializeObject("Sprint1/src/TascaS105JavaUtils/Exercise5/exercise5.ser");
        if (deserializedLister != null) {
            System.out.println("Directory Name: " + deserializedLister.getDirectoryName());
        }
    }
}
