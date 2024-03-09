/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstration_instance;

/**
 *
 * @author sakshi
 */
public class main extends perfect implements strong{

    public static void main(String[] args) {
        perfect pr = new main();
        
        int n = 28;
        if(pr.isperfect(n) == 1)
        {
            System.out.println(n+"is perfect");
        }
        else
        {
            System.out.println(n+"is not perfect");
        }
        strong st = new main();
        if(st.isstrong(n) == 1)
        {
            System.out.println(n+"is strong");
        }
        else
        {
            System.out.println(n+"is not strong");
        }
        
    }

    @Override
    public int isperfect(int n) {
        int sum = 0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum = sum +i;
            }
        }
        if(sum == n)
        {
            return 1;
        }else
        {
            return 0;
        }
    }

    @Override
    public int isstrong(int n) {
     int fact =1 ,sum=0,temp = n;
     while(n!=0)
     {
         fact = 1;
         int rem = n%10;
         for(int i=1;i<=rem;i++)
         {
             fact = fact * i;
         }
         sum = sum +fact;
         n = n/10;
         
     }
     if(temp == sum)
     {
         return 1;
     }else
     {
         return 0;
     }
    }

   
}