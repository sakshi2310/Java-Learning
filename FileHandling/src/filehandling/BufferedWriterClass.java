/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterClass {
    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("temp2.txt");
        BufferedWriter writer = new BufferedWriter(file);
        String str;
        writer.write("welcome to temp2 file...");
        writer.newLine();
        writer.write("hey...");
        writer.close();
    }
}
