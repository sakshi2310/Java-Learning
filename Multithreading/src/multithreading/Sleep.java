/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;
class Thread1 extends Thread
{

    @Override
    public void run() {
        for(int i=1 ;i<=10;i++)
        {
            try
            {
                Thread.sleep(500);
                
            }catch(InterruptedException ex)
            {
                ex.printStackTrace();
            }
            if(i%2 == 1)
            {
                System.out.println("odd : "+i);
            }
        }
    }
    
}
class Thread2 extends Thread
{

    @Override
    public void run() {
        for(int i=1 ;i<=10;i++)
        {
            try
            {
                Thread.sleep(500);
                
            }catch(InterruptedException ex)
            {
                ex.printStackTrace();
            }
            if(i%2 == 0)
            {
                System.out.println("even : "+i);
            }
        }
    }
    
}

public class Sleep {
    public static void main(String[] args) {
//        Thread1 t1 = new Thread1();
//        Thread2 t2 = new Thread2();
//        Thread th1 = new Thread(t1);
//        Thread th2 = new Thread(t2);
//        th1.start();
//        th2.start();
        
          Thread1 t1 = new Thread1();
          Thread2 t2 = new Thread2();
          t1.start();
          t2.start();
           
        
    }
}
