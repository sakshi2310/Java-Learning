/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filehandling;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputClass {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fin = new FileInputStream("temp.txt");
        DataInputStream datain  = new DataInputStream(fin);
        System.out.println("Data :"+datain.read());
        datain.close();
    }
    
}
