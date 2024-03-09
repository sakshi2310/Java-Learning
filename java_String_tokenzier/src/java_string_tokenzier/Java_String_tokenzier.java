/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_string_tokenzier;

import java.util.StringTokenizer;

public class Java_String_tokenzier {

    public static void main(String[] args) {
        String str = "helloo students how are you..";
        StringTokenizer token = new StringTokenizer(str);
        while(token.hasMoreElements())
        {
            System.out.println("token : "+token.nextToken());
        }
    }
    
}
