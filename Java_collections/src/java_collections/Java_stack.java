/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_collections;

import java.util.Stack;

public class Java_stack {
    public static void main(String[] args) {
        Stack ar = new Stack();
        ar.push(10);
        ar.push(20);
        ar.push("sakshi");
        ar.push('s');
        ar.push(56.7);
        
        for(int i =0;i<ar.size();i++)
        {
            System.out.println(""+ar.get(i));
        }
        
        ar.pop();
        ar.pop();
        System.out.println("\n\nAfter the pop:");
        for(int i =0;i<ar.size();i++)
        {
            System.out.println(""+ar.get(i));
        }
        
    }
}
