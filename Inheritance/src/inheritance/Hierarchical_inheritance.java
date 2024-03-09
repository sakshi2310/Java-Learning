/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
    int ispalindrome(int n)
    {
        int rev = 0,temp = n;
        while(n!=0)
        {
            int rem = n%10;
            rev = rev * 10+rem;
            n = n/10;
        }
        if(temp == rev)
        {
            return 1;
        }else
        {
            return 0;
        }
    }
    
}
class primeDisp extends CheckNum
{
    void primePrint(int n)
    {
        if(isprime(n) == 1){
            System.out.println(n+" is prime number");
        }else
        {
            System.out.println(n+" is not prime number");
        }
    }
}

class palindromeDisp  extends CheckNum
{
    void palindromeprint(int n1)
    {
        if(ispalindrome(n1) == 1){
            System.out.println(n1+" is palindrome number");
        }else
        {
            System.out.println(n1+" is not palindrome number");
        }
    }
}


public class Hierarchical_inheritance {
    public static void main(String[] args) {
        primeDisp prime = new primeDisp();
        int n = 23;
        prime.isprime(n);
        prime.primePrint(n);
        int n1 = 121;
        palindromeDisp palindrome = new palindromeDisp();
        palindrome.ispalindrome(n1);
        palindrome.palindromeprint(n1);
        
        
        
    }
}
