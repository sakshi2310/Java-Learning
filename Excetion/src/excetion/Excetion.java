
package excetion;

public class Excetion {

    public static void main(String[] args) {
     
        int a= 20,b=0,c=0;
        try
        {
            c = a/b;
            System.out.println("sum = "+c);
        }
        catch(ArithmeticException ex)
        {
            System.out.println("only non zero values are allowed.."+ex.getLocalizedMessage());
        }
        finally
        {
            System.out.println("sum = "+c);
        }
    }
    
}
