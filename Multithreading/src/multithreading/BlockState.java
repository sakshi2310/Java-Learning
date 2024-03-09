
package multithreading;

class Test
{
    void checkblockstate() throws InterruptedException
    {
        Thread th1 = new Thread(new process1());
        Thread th2 = new Thread(new process1());
        th1.start();
        System.out.println("thread1 is running....");
        Thread.sleep(5000);
        th2.start();
        
        Thread.sleep(5000);
        System.out.println("thread 2 status : "+th2.getState());
        
        
    }
}

class process1 implements Runnable
{

    @Override
    public void run() {
        
    }
    public static synchronized void perromTask()
    {
        while(true)
        {
            
        }
    }
    
}
public class BlockState {
    public static void main(String[] args) throws InterruptedException {
        Test t = new Test();
        t.checkblockstate();
    }
}
