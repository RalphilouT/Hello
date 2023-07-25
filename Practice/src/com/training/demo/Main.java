package com.training.demo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {

            File myObj = new File("test.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }

            FileWriter myWriter = new FileWriter("test.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            System.out.println("Successfully wrote to the file.");
            myWriter.close();

            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        Second second = new Second(10);

        System.out.println("Hello world!");
        System.out.println(second.getX());
        System.out.println(Second.getY());
        second.display();
    }
}