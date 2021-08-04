package com.files.www;

import java.io.*;
import java.util.Scanner;

public class TestFile {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = null;
        try {
            FileWriter fileWriter = new FileWriter("file.txt");
            BufferedWriter bw = new BufferedWriter(fileWriter);
            bw.write("Tilak sai kumar");
            bw.write(100);
            char[] ch = {'a', 'b', 'c', 'd'};
            bw.newLine();
            bw.write(ch);
            // bw.write(10.97f);
            //bw.write(10.97d);
            //bw.write(true);
            bw.close();

            pw = new PrintWriter("file2.txt");
            pw.write("Tilak sai kumar Nagulla");
            pw.println(100);
            char[] ch1 = {'a', 'b', 'c', 'd'};
            pw.println(ch1);
            pw.println(10.98d);
            pw.println(true);
            pw.println(10.76f);
            String sCurrentLine;
            BufferedReader bufferedReader = new BufferedReader(new FileReader("file2.txt"));
            while ((sCurrentLine = bufferedReader.readLine()) != null) {
                System.out.println(sCurrentLine);

            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            {
                pw.close();

            }
        }

    }
}
