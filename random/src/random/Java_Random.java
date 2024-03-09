/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package random;

import java.util.Random;

public class Java_Random {

    public static void main(String[] args) {
        // using math.random method
        int r = (int)(Math.random()*20);
        System.out.println("RANDOM = "+r);
        
        // using random class 
        Random random = new Random();
        int min = 65, max = 91;
        char value = (char) (random.nextInt(max - min) + min);
        System.out.println("value: " + value);
    }

    

  

    
    

    

    
    
}
