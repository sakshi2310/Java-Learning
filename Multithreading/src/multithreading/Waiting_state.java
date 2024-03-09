/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;

import static multithreading.Test.th1;

class Test
{
    static Thread th1 = new Thread(new process1());
    void checkwaitstate() throws InterruptedException
    {
        th1.start();
    }
}
class process1 implements Runnable
{

    @Override
    public void run() {
        Thread th2 = new Thread(new process2());
        th2.start();
        try
        {
            th2.join();
        }catch(InterruptedException ex)
        {
            ex.printStackTrace();
        }
        System.out.println("Thread 2 status :"+ th2.getState());
    } 
}
class process2 implements Runnable
{

    @Override
    public void run() {
        System.out.println("thread 1 status : "+th1.getState());
    }
    
}
public class Waiting_state {
    public static void main(String[] args) throws InterruptedException {
        Test t = new Test();
        t.checkwaitstate();
    }
}
