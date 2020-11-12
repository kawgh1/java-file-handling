package com.kwgdev.learningfilereader;

import java.io.*;

// Utilizes Try With Resources from JAVA 7+
// this is the best way

public class TryWithResources {

    public static void main(String[] args) {

        File file = new File("myfile.txt");

        // try with resources automatically closes the defined resources --> no finally block required
        // any resources (FileReader, BufferedReader, etc.) that extends AutoCloseable interface
        // can be listed in try with resources and will close automatically in Java 7+
        // AutoCloseable was created by Josh Bloch
        try (FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);){

            String line = bufferedReader.readLine();

            // keep reading each line until no more lines
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
//            e.printStackTrace();
            System.out.println("File not found");
        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println("Problem reading the file " + file.getName());

        }

    }
}
