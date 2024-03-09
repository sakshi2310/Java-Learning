import java.util.*;
public class JaggedArray {
    public static void main(String[] args) {
        int ar[][] = new int[5][];
         
        Scanner sc = new Scanner(System.in);
        
        ar[0] = new int[1];
        ar[1] = new int[2];
        ar[2] = new int[3];
        ar[3] = new int[4];
        ar[4] = new int[5];
        
        for(int i=0 ;i<ar.length ; i++)
        {
            for(int j=0 ; j<ar[i].length ;j++)
            {
                System.out.println("ar["+i+"]["+j+"]=");
                ar[i][j] = sc.nextInt();
                
            }
            System.out.println("");
        }
        
        for(int i=0 ;i<ar.length;i++)
        {
            for(int j=0 ;j<ar[i].length ;j++)
            {
                System.out.print(""+ar[i][j]);
            }
            System.out.println("");
        }
             
    }
}
