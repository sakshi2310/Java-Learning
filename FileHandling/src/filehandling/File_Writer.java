/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_Writer {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("file1.txt");
        writer.write("hello good morning");
        writer.close();
        int i=0;
        FileReader file = new FileReader("file1.txt");
        while((i=file.read())!=-1)
        {
            System.out.println(""+(char)i);
        }
        file.close();
    }
}
