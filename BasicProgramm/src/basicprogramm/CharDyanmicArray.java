/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicprogramm;
import java.util.*;
public class CharDyanmicArray {
    public static void main(String[] args) {
         char ch[] = new char[5];
    
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<ch.length;i++)
        {
            System.out.println("enter the ch["+i+"]= ");
            ch[i] = sc.next().charAt(0);
        }
        for(char c:ch)
        {
            System.out.println(""+c);
        }
    }
        
 }
    

