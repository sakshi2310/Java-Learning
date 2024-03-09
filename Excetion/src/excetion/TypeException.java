
package excetion;

import java.util.Scanner;

class Test
{
    int n=5;
    void getData()
    {
        // stackoverflow expetion
                 
//getData(); 
        
        // solution of stack overflow expecion
        if(n>0)
        {
            n--;
            getData();
        }
    }
}
public class TypeException {
    
    public static void main(String[] args) {
        
        // stack ovetflow and 
        Test t = new Test();
        t.getData();
        
       
        
        // arithmetic exception
        int a=20,b =10 ,c=0;
        
        // Array out of bound exception
        int ar[] = {10,20,30,40,50};
        
        // string out of bount exception
        String str = " hello sakshi";
        
        // number format exception
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n1");
        String n1 = sc.nextLine();
        System.out.println("enter the n2:");
        String n2 = sc.nextLine();
        
        try
        {
            // arithmetic expetion
            c = a/b; 
            System.out.println("sum = "+c+"\n");
            
            //  Array out of bound exception
            for(int i=0;i<5;i++)
            {
                System.out.println("ar = "+ar[i]);
            }
            
            // string out of bount exception
            System.out.println("\nsubstring = "+str.substring(7,13));
            
            // number format exception
            int sum = Integer.parseInt(n1)+Integer.parseInt(n2);
            System.out.println("\nsum = "+sum);
            
             // null pointer
            Test t1 = null;
            t1.getData();

          
        }
        // artithemetic expection
        catch(ArithmeticException ex)
        {
            System.out.println("only non zero values are allowed..");
            
        }
        //  Array out of bound exception
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("please provide values less than or equal the size...");
        }
        
        // string out of bount exception
        catch(StringIndexOutOfBoundsException ex)
        {
            System.out.println("\nLength of substring is large...");
        }
        
        // number format exception
        catch(NumberFormatException ex)
        {
            System.out.println("\nonly numbers are allowed...");
        }
        
        // null pointer
        catch(NullPointerException ex)
        {
            System.out.println("\nplease give the memory of class..");
        }
    }
    
}
