package com.kwgdev.inputscanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws FileNotFoundException {

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter some text:  ");
//        String enteredText = input.nextLine();
//        System.out.println(enteredText);
        try {
            File file = new File("myfile.txt");
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
            System.out.println("File not found");
        }


        MyFileUtils myUtil = new MyFileUtils();
        try {
            System.out.println(myUtil.subtract10FromLargerNumber(8));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
