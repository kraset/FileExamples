/*
 * This file contains file read/write examples
 * for text files and binary data files.
 */
package fileinoutexamples;

/**
 *
 * @author anc
 */
public class FileInOutExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Example 1: Simple text file, write, then read.

        //Create array list of lines and write them to text file
        ReadWriteTextFile.writeTextFile();

        //Read the file and print out the content
        ReadWriteTextFile.readTextFile();


        //Example 2: save a whole object to file and read it again..
        //We are using our own Person class with name and age.
        //Make sure that Person implements "Serializable".
        Person someCoolNewGirl = new Person("Anna", 29); //First create the object

        //Write it to file.
        //Note: writeObject doesn't know or care what kind of object.
        ReadWriteObject.writeObject(someCoolNewGirl);

        //Read back the object from file.
        //Note: readObject doesn't know or care what kind of object.
        //But WE know... so we "type cast" to Person, that's why it says (Person).
        Person personFromFile = (Person)ReadWriteObject.readObject();
        System.out.println("We just read some cool person object from file:");
        System.out.println(personFromFile.name);
        System.out.println(personFromFile.age);

    }

}
