/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_collections;

import java.util.ArrayList;
import java.util.List;

class Test
{
    int a,b;
    void fun()
    {
        System.out.println("Fun called...");
    }
}
public class Java_ArrayList {
 
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        ArrayList list2 = new ArrayList();
        List<String> list = new ArrayList();
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        
        for(int i=0;i<list.size();i++)
        {
            System.out.println(""+list.get(i));
        }
        
        
    }
}
