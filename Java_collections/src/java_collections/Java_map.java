/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_collections;

import java.util.Hashtable;
import java.util.Map;


public class Java_map {
    public static void main(String[] args) {
        Map <Integer,String> m = new Hashtable();
       
        m.put(10,"sakshi");
        m.put(20,"veru");
        m.put(30,"dhuli");
        m.put(40,"kashu");
        m.put(50,"yashu");
        
        System.out.println(""+m);
        System.out.println(""+m.get(20));
        
        
    }
}
