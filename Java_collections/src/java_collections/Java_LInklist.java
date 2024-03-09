/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Java_LInklist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List list = new LinkedList();
        List list1 = new LinkedList();
        String str;
        for(int i=1;i<=3;)
        {
            System.out.println("enter the string :");
            str = sc.nextLine();
            if(!list.contains(str))
            {
                list.add(str);
                i++;
            }
        }
        System.out.println("List : "+list);
//        list.clear();
//        System.out.println("List : "+list);
        
        // wap to comapre the two list
        
        for(int i=1;i<=3;)
        {
            System.out.println("enter the string :");
            str = sc.nextLine();
            if(!list1.contains(str))
            {
                list1.add(str);
                i++;
            }
        }
        System.out.println("list 1 :" +list1);
        
        if(list.equals(list1))
        {
            System.out.println("list are same");
        }else
        {
            System.out.println("list are different");
        }
        
    }
}
