/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stringfunctions;

public class splitFunction {
    public static void main(String[] args) {
        String str = "hello sakshi! how are y ou";
        String[] strArr = str.split(" ");
        for(String s:strArr)
        {
            System.out.println(""+s);
        }
               
    }
}
