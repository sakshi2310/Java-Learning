/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_collections;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sakshi
 */
class Test
{
    int a,b;
    void fun()
    {
        System.out.println("Fun called...");
    }
}
public class Java_collections {

    public static void main(String[] args) {
        
        
        // List collactions 
        Test t1[] = new Test[5];
        for(int i=0;i<t1.length;i++)
        {
            t1[i] = new Test();
        }
        List list = new ArrayList();
        list.add(10);
        list.add("sakshi");
        list.add(14.6);
        list.add('c');
        System.out.println("List : "+ list);
        
        
        
        
    }
    
    
    
}
