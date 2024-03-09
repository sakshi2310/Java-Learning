/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructeroverloading;
class Data
{
    int a,b;
    public Data(int a , int b)
    {
        this.a = a;
        this.b = b;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    public Data(int a ,int b ,int c)
    {
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
    }
    
    
}
public class ConstructerOverloading {

    public static void main(String[] args) {
        Data d = new Data(10,20);
        Data d1 = new Data(10,20,30);    }
    
}
