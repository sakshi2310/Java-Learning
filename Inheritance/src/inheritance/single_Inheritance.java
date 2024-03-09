  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance;
class CheckNum
{
    int isprime(int n)
    {
        int cnt = 0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                cnt++;
            }
        }
        if(cnt==2)
        {
            return 1;
        }else
        {
            return 0;
        }
        
    }
}
class disp extends CheckNum
{
    void print(int n)
    {
        if(isprime(n) == 1){
            System.out.println(n+" is prime number");
        }else
        {
            System.out.println(n+" is not prime number");
        }
    }
}

public class single_Inheritance {

 
    public static void main(String[] args) {
        disp d = new disp();
        d.print(23);
    }
    
}
