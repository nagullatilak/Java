
package com.files.www;

import java.io.File;
import java.util.Scanner;

public class Assignment3 {
    public void findFile() {
        //Give the address of file or folders
        File file = new File("/home/tilan/IdeaProjects/JavaPractice");
        //To store name of the file
        String name;
        boolean condition = true;
        Scanner sc = new Scanner(System.in);
        //do while is used for iteration
        do {
            int a = 0;
            System.out.println("Enter the name of the file :");
            //Storing the file name in to name variable
            name = sc.nextLine();
            //list of files is stored in string
            String[] files = file.list();
            //continous checking use foreach loop
            for (String str : files) {
                //check the name of the file present or not
                Boolean value = name.equals(str);
                //if value is true
                if (value) {
                    a = 1;
                    System.out.println("File Found .....");
                    System.out.println("File  Name :" + str);
                    //print the path of a file
                    System.out.println("Path :" + file.getAbsolutePath()+"/"+name);
                }

            }
            if (a == 0) {
                System.out.println("File not found : Please Reenter the name");
            }
        } while (condition);
    }
        public static  void main(String[] args){
        Assignment3 obj = new Assignment3();
        //call the find file method
            obj.findFile();

        }

}
