/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stringfunctions;

public class ignoreequalcase {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "HELLO";
        if(str1.equalsIgnoreCase(str2))
        {
            System.out.println("both string are equaltrue");
        }else
        {
            System.out.println("both string are not equal false");
        }
    }
}
