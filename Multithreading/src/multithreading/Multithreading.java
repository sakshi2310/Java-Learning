
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multithreading;

class Test
{
    Thread th = new Thread();
    void checkIntialState()
    {
        System.out.println("Threas state : "+th.getState());
    }
    void checkstatstate()
    {
        th.start();
        System.out.println("Thread state : "+th.getState());
    }
}


public class Multithreading {

    public static void main(String[] args) {
       Test t = new Test();
       t.checkIntialState();
       t.checkstatstate();
    }
    
}
