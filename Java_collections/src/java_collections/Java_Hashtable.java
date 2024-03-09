/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_collections;

import java.util.Hashtable;
import java.util.Scanner;


public class Java_Hashtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hashtable<String,String> h = new Hashtable();
        h.put("Ajay","7687895675");
        h.put("nisha","563456789");
        h.put("priya","4564322345");
        h.put("kriva","3457146895");
        
        System.out.println("All Data = "+h.entrySet());
        System.out.println("Keys = "+h.keySet());
        System.out.println("values = "+h.values());
        
        if(h.contains("34571468953"))
        {
            System.out.println("inside");
        }else
        {
            System.out.println("Not found");
        }
        
                
    }
}
