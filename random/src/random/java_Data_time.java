/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package random;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class java_Data_time {
    public static void main(String[] args) {
        
        // Date and Time
        Date dt = new Date();
        System.out.println("Today Date:"+dt);
        
        
        // gregorian calendar 
        
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println("cal:"+cal.get(Calendar.DATE)+" / "+(cal.get(Calendar.MONTH)+1)+" / "+cal.get(Calendar.YEAR));
        
    }

    
            
}
