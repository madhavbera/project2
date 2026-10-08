package com.madhav.testapi.controllers;

import java.io.FileWriter;
import java.io.IOException;

public class WRITE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName="example.txt";
		try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello Madhav!\n");
            writer.write("This is a Java file handling example.\n");
            writer.write("Learning file read and write.");
            writer.close();
            System.out.println("File written successfully.");
        } 
        catch (IOException e) {
            System.out.println("Error while writing file.");
            e.printStackTrace();
        }

	}

}
