package com.madhav.testapi.controllers;


import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Countalpha {

    public static void main(String[] args) {

        String fileName = "example.txt";

        // Writing to file
      
        // Reading from file
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(reader);

            String line;
            System.out.println("\nReading file content:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } 
        catch (IOException e) {
            System.out.println("Error while reading file.");
            e.printStackTrace();
        }
    }
}
