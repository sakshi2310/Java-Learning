
package garbagecollations;

class Demo
{
    public void get()
    {
        System.out.println("class is called");
    }

//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("garbage collationer is called");
//    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("garbage collationer is called");
    }
       
    
}

public class GarbageCollations {

    public static void main(String[] args) {
      
        Demo d = new Demo();
        d.get();
        d = (null);
        System.gc();
        
    }
    
}
