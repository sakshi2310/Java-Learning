/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javainnerclass;

import java.util.Scanner;

class Student
{
    String name;
    int age;
    Scanner sc = new Scanner(System.in);
    void getData()
    {
        System.out.println("enter the name:");
        name = sc.nextLine();
        System.out.println("enter the age:");
        age = sc.nextInt();
    }
    class Mark
    {
       int java,c_sharp,seo,os;
       void getData()
       {
           
           System.out.println("enter the mark of java:");
           java = sc.nextInt();
           System.out.println("enter the mark of c#:");
           c_sharp = sc.nextInt();
           System.out.println("enter the mark of seo:");
           seo = sc.nextInt();
           System.out.println("enter the mark of os:");
           os = sc.nextInt();
       }
       
    }
}
public class JavaInnerClass {


    public static void main(String[] args) {
       Student s = new Student();
        s.getData();
        Student.Mark m = s.new Mark();
        m.getData();
    }
    
}
