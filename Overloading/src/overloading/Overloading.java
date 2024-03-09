/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overloading;
class data
{
    void getval()
    {
        int a = 10 , b = 20;
        System.out.println("sum of a and b = "+(a+b));
    }
    void getval(int a ,int b)
    {
        System.out.println("sum of a and b = "+(a+b));
        
    }
    void getval(int a , int b , double c)
    {
        System.out.println("sum of a and b and c = "+(a+b+c));
    }
}

public class Overloading {

   
    public static void main(String[] args) {
    
       data g = new data();
       g.getval();
       g.getval(23,45);
       g.getval(10, 40, 20.5);
    }
    
}
