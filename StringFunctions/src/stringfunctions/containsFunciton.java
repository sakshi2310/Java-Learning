/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stringfunctions;

public class containsFunciton {
    public static void main(String[] args) {
        String str = "hello world!";
        String str1="e";
        System.out.println("contains : "+str.contains("h"));
//        System.out.println("contains : "+str.contains(str1));
        if(str.contains(str1))
        {
            System.out.println("available");
        }else
        {
            System.out.println("not available");
        }
        
    }
}
