/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicprogramm;

import static java.time.Clock.system;
import java.util.*;
        
        
public class DynamicArray {
    public static void main(String[] args) {
        int ar[] = new int[5];
               
        Scanner sc = new Scanner(System.in);
            
        for(int i=0;i<ar.length;i++)
        {
            System.out.println("enter the a["+i+"]");
            ar[i] = sc.nextInt();
        }
        
        for(int i:ar)
        {
            System.out.println(""+i);
        }
               
    }
}
