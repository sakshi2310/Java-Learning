/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filehandling;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutClass {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fout = new FileOutputStream("temp.txt");
        DataOutputStream dataout = new DataOutputStream(fout);
        dataout.writeInt(65);
        dataout.close();
    }
}

