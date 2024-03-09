/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dyanamicmethoddispatch;

class Bank
{
   public int RateOfInterest()
   {
       return 0;
   }
    
}
class SBI extends Bank
{

    @Override
    public int RateOfInterest() {
        return 8;
    }
    
}
class BOB extends Bank
{

    @Override
    public int RateOfInterest() {
        return 9;
    }
    
}

public class DyanamicMethodDispatch {
    public static void main(String[] args) {
      Bank b;
      b = new SBI();
      System.out.println("rate of SBI :"+b.RateOfInterest());
      
      b = new BOB();
        System.out.println("rate of BOB :"+b.RateOfInterest());
      
    }
    
}
