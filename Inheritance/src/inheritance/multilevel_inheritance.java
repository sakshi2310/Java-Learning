
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
class PrimeList extends disp
{
    void list(int n)
    {
        System.out.println("the follwing is prime list");
        for(int i=0;i<=n;i++){
            if(isprime(i)==1)
            {
                System.out.print(" "+i);
            }
        }
    }
}
public class multilevel_inheritance {
 
    public static void main(String[] args) {
         disp d = new disp();
        
        d.print(23);
        PrimeList c = new PrimeList();
        c.list(50);
    }
}
