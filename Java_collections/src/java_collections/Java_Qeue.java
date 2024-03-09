/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_collections;

import java.util.LinkedList;
import java.util.Queue;

public class Java_Qeue {
    public static void main(String[] args) {
        Queue q = new LinkedList();
        q.add("sakshi");
        q.add("isha");
        q.add("yashvi");
        q.add("veeru");
        q.add("dhuli");
        q.add("kashu");
        
        System.out.println(""+q);
        System.out.println("After the poll:");
        q.poll();
        System.out.println(""+q);
    }
}
