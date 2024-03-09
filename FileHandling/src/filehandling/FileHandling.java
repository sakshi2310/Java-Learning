
package filehandling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileHandling {

    public static void main(String[] args) {
    
        try {
    
            RandomAccessFile file = new RandomAccessFile("first.txt","rw");
            String str = "hello how are you...";
            file.write(str.getBytes());
            file.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println("File not created..");
            
        } catch (IOException ex) {
            System.out.println("file can't open try again...");
        }
   
        
    }
    
}
