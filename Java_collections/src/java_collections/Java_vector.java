/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_collections;

import java.util.Vector;

public class Java_vector {
    public static void main(String[] args) {
        Vector vc = new Vector();
        vc.add("sakshi");
        vc.add(20);
        vc.add(12.7);
        vc.add('a');
        
        for(int i=0;i<vc.size();i++)
        {
            System.out.println(""+vc.get(i));
        }
        
        
        
    }
}
