/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class BufferedRader_class {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader file = new FileReader("file1.txt");
        BufferedReader bf = new BufferedReader(file);
        int i=0;
        String str;
//        while((i=bf.read())!=-1)
//        {
//            System.out.println(""+(char)i);
//        }
        
        str = bf.readLine();
        System.out.println("String = "+str);
        
        bf.close();
    }
}
