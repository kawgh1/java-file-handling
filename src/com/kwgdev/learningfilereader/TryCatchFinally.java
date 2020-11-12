package com.kwgdev.learningfilereader;

import java.io.*;

// This is a very common way of reading data used in JAVA 6
// Try with Resources was created in Java 7+

public class TryCatchFinally {

    public static void main(String[] args) {
        File file = new File("myfile.txt");
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        try {
            // File reader reads files character by character
            fileReader = new FileReader(file);
            // Buffered reader reads fileReaders line by line
            bufferedReader = new BufferedReader(fileReader);

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
        } finally {

            // finally is usually where you close resources
            // finally block ALWAYS RUNS
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (fileReader != null) {
                    fileReader.close();
                }


            } catch (IOException e) {
//                e.printStackTrace();
                System.out.println("Unable to close file " + file.getName());

            }
            // catching NullPointerExceptions is generally indicative that
            // the code is not properly written, figure out what is giving null and fix it
//            catch (NullPointerException exception) {
//                System.out.println(" file was probably never opened to close" + file.getName());
//            }

        }

    }
}


