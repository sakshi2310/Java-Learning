/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ReadCharacter {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("first.txt");
            int i =0;
            while((i=file.read())!= -1)
            {
                System.out.println(""+(char)i);
            }
            file.close();
        } catch (FileNotFoundException ex) {
            System.out.println("file can't read");
        } catch (IOException ex) {
            System.out.println("can't read");
        }
        
    }
}
