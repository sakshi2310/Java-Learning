/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excetion;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class Test
{
    int n = 5;
    void getData() throws Exception
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n1");
        String n1 = sc.nextLine();
        System.out.println("enter the n2:");
        String n2 = sc.nextLine();
        
        if(n1.equals("0") || n2.equals("0"))
        {
            throw new Exception("zero are not allowed..");
        }else
        {
            int sum = Integer.parseInt(n1)+Integer.parseInt(n2);
            System.out.println("\nsum = "+sum);
        }
    }
}
public class UserDefineException {
    public static void main(String[] args) {
        Test t = new Test();
        try {
            t.getData();
        } catch (Exception ex) {
            System.out.println(""+ex.getLocalizedMessage());
        }
    }
}
  