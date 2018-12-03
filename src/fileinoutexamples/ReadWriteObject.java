/*
 * This class will write and read objects to/from a file.
 * We don't care about what kind of object, but it must be "serializable".
 */
package fileinoutexamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadWriteObject {

    //Write an object to a file (NOT text file!)
    public static void writeObject(Object myObject) {

        //We are naming the object ".data" just to be clear that it's not a text file.
        File file = new File("c:/dev/git/FileInOutExamples/myCoolObject.data");
        try (ObjectOutputStream oOut = new ObjectOutputStream(new FileOutputStream(file))) {
            oOut.writeObject(myObject);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    //Read an object from a file.
    public static Object readObject() {
        Object objectFromFile = null;
        File file = new File("c:/dev/git/FileInOutExamples/myCoolObject.data");
        try (ObjectInputStream oIn = new ObjectInputStream(new FileInputStream(file))) {
            objectFromFile = oIn.readObject();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return objectFromFile;
    }
}
