/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filehandling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


public class Readfile {
 public static void main(String[] args) {
        try {
            RandomAccessFile file = new RandomAccessFile("first.txt","rw");
            byte b[] = new byte[1024];
            file.read(b);
            String str = new String(b);
            System.out.println("string = "+str);
            file.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println("file can't open");
        } catch (IOException ex) {
            System.out.println("file can't readable..");
        }
        
    }   
}
