package com.files.www;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignment {
    public  static  void main(String[] args) throws IOException {
        BufferedWriter fw = null;
        try {
            //Creating a file
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter File name :");
            String name = sc.nextLine();
            File myObj = new File(name);
            if (myObj.createNewFile()) {
                //Reading a file
                System.out.println("Name of the file :" + myObj.getName());
            } else {
                System.out.println("File already exists");
            }
            //Write a file
            fw = new BufferedWriter(new FileWriter(myObj));
            fw.write("Name : Tilak sai kumar");
            fw.newLine();
            fw.write("Address : Gudivada");
            fw.newLine();
            fw.write("Mobile No :7799800653");
            fw.newLine();
            fw.write("Age : 24");

            //Get file information
            File read = new File("TestFile.txt");
            Scanner myReader = new Scanner(read);
            while (myReader.hasNextLine()){
                String data= myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }
        catch (IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
        finally {
            fw.close();

        }

    }
}
