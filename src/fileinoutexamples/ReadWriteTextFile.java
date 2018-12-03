/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileinoutexamples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anc
 */
public class ReadWriteTextFile {

    //This example function writes an array list of lines to a text file.
    public static void writeTextFile() {
        /*
            You need a try/catch statement around file operations.
            If something goes wrong with the file, for example:
            the file does not exist, hard disck crash, etc
            ... the error will be catched and printed in the catch-statement.
         */
        try {
            Path path = Paths.get("c:/dev/git/FileInOutExamples/test1.txt");

            //Create a test array list.
            ArrayList<String> lines = new ArrayList<>();
            lines.add("Jam");
            lines.add("Bread");
            lines.add("Cereals");

            /*
                Now write the array list to a text file.
                .TRUNCATE will destroy content in existing file.
                .APPEND will add content to existing file.
             */
            Files.write(path, lines, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            //Print out whatever error occurred.
            e.printStackTrace();
        }
    }

    public static void readTextFile() {
        try {
            //Tell where the file is...
            Path path = Paths.get("c:/dev/git/FileInOutExamples/test1.txt");

            //Read all the lines into an ArrayList!
            List<String> lines = Files.readAllLines(path);

            //And print them out, to check that it worked!
            for (String line : lines) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
