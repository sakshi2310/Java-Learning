/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_awt_simple_calc;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Java_AWT_simple_calc extends WindowAdapter {

    Frame frame;
    Label lbl1,lbl2,ans;
    Button btn1,btn2,btn3,btn4;
    TextField txt1,txt2;
    int n1,n2,Ans;
    Java_AWT_simple_calc()
    {
        
     // frame
        //create the frame object
        frame = new Frame("frame");
        frame.setSize(1000,500);  // to fix the window size
        
    //make the frame visible
        frame.setVisible(true);
        
    //add the listener to call the lister for this class 
        frame.addWindowListener(this);
        frame.setLayout(null);
      
    // label 
        // create object of lable
        lbl1 = new Label("enter the num1 : ");
        lbl1.setBounds(50, 50, 100,30);
        
        lbl2 = new Label("enter the num2 : ");
        lbl2.setBounds(50, 90, 100,30);
        
    // text box
    
        // create the object of text box
        txt1 = new TextField();
        txt1.setBounds(150, 50, 100,30);
    
        txt2 = new TextField();
        txt2.setBounds(150, 90, 100,30);
    
   // button
        
        // create button object
        btn1 = new Button("ADD");
        btn1.setBounds(280, 30, 50, 30);
        btn1.setBackground(Color.GREEN);
        
        // add event
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                try
                {
                   n1 = Integer.parseInt(txt1.getText());
                   n2 = Integer.parseInt(txt2.getText());
                  
                  
                }catch(Exception ex)
                {
                    
                }
                Ans = n1 + n2;      
                ans.setText("Ans:"+Ans);
                
            }
        } );
        
        
        btn2 = new Button("SUB");
        btn2.setBounds(280, 70, 50, 30);
        btn2.setBackground(Color.green);
        
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                try
                {
                   n1 = Integer.parseInt(txt1.getText());
                   n2 = Integer.parseInt(txt2.getText());
                  
                  
                }catch(Exception ex)
                {
                    
                }
                Ans = n1 - n2;
                ans.setText("Ans:"+Ans);
                
            }
        } );
        
        btn3 = new Button("MUL");
        btn3.setBounds(280, 110, 50, 30);
        btn3.setBackground(Color.green);
        
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                try
                {
                   n1 = Integer.parseInt(txt1.getText());
                   n2 = Integer.parseInt(txt2.getText());
                  
                  
                }catch(Exception ex)
                {
                    
                }
                Ans = n1 * n2;
                ans.setText("Ans:"+Ans);
                
            }
        } );
        
        
        btn4 = new Button("DIV");
        btn4.setBounds(280, 150, 50, 30);
        btn4.setBackground(Color.green);
        
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                try
                {
                   n1 = Integer.parseInt(txt1.getText());
                   n2 = Integer.parseInt(txt2.getText());
                  
                  
                }catch(Exception ex)
                {
                    
                }
                Ans = n1 / n2;
                ans.setText("Ans:"+Ans);
                
            }
        } );
        
    // ans label
    
        ans = new Label("Ans:");
        ans.setBackground(Color.yellow);
        ans.setAlignment(1);
        ans.setBounds(50, 140, 200,30);
        
    
        
        
      
    // add all objects in frame
        
        // label add
        frame.add(lbl1);
        frame.add(lbl2);
        frame.add(ans);
        
       
        // text input add
        frame.add(txt1);
        frame.add(txt2);
        
        
        // btn add
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
    }
    
    
    public static void main(String[] args) {
        
        new Java_AWT_simple_calc();
    }

    @Override
   public void windowClosing(WindowEvent e) {
        frame.dispose();
    }
    
    
    
}
