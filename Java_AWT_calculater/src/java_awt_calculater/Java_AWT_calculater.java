        
package java_awt_calculater;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Java_AWT_calculater extends WindowAdapter implements ActionListener{
    
    Frame frame;
    Label lbl;
    Font lblfont;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,plus,minus,div,mul,equal,c,clear,per,point;
    String temp,operator;
    int n1,n2,ans;
    Java_AWT_calculater()
    {
     
    // Frame
       
        frame = new Frame("calc");
        frame.setSize(320,500);
        frame.setVisible(true);
        
    // add listener 
    
        frame.addWindowListener(this);
        frame.setLayout(null);
        
    // LABLE
        lbl = new Label();
        lbl.setBounds(0, 0, 310, 100); 
        lbl.setBackground(Color.LIGHT_GRAY);
        lbl.setAlignment(Label.RIGHT);
        lblfont = new Font("SansSerif", Font.PLAIN, 50);
        lbl.setFont(lblfont);
    // Button
    
        // 1 row
        clear = new Button("CE");
        clear.setBounds(0,105, 75, 50);
        clear.addActionListener(this);
        
        c = new Button("<<");
        c.setBounds(80,105, 75, 50);
        c.addActionListener(this);

        per = new Button("%");
        per.setBounds(160,105, 75, 50);
        per.addActionListener(this);

        div = new Button("/");
        div.setBounds(240,105, 75, 50);
        div.addActionListener(this);
        
        // 2 row
        
        b7 = new Button("7");
        b7.setBounds(0,160, 75, 50);
        b7.addActionListener(this);
        
        b8 = new Button("8");
        b8.setBounds(80,160, 75, 50);
        b8.addActionListener(this);
        
        b9 = new Button("9");
        b9.setBounds(160,160, 75, 50);
        b9.addActionListener(this); 
        

        mul = new Button("*");
        mul.setBounds(240,160, 75, 50);
        mul.addActionListener(this);
//        
        // 3 row 
        
        b4 = new Button("4");
        b4.setBounds(0,215, 75, 50);
        b4.addActionListener(this);
        
        b5 = new Button("5");
        b5.setBounds(80,215, 75, 50);
        b5.addActionListener(this);

        b6 = new Button("6");
        b6.setBounds(160,215, 75, 50);
        b6.addActionListener(this);

        minus = new Button("-");
        minus.setBounds(240,215, 75, 50);
        minus.addActionListener(this);
        
//        // 4 row
        b1= new Button("1");
        b1.setBounds(0,270, 75, 50);
        b1.addActionListener(this);
        
        b2 = new Button("2");
        b2.setBounds(80,270, 75, 50);
        b2.addActionListener(this);

        b3 = new Button("3");
        b3.setBounds(160,270, 75, 50);
        b3.addActionListener(this);

        plus = new Button("+");
        plus.setBounds(240,270, 75, 50);
        plus.addActionListener(this);
        
       
        // 5 row
        b0 = new Button("0");
        b0.setBounds(0,325, 150, 50);
        b0.addActionListener(this);
        
        point = new Button(".");
        point.setBounds(160,325, 75, 50);
        point.addActionListener(this);
     
        equal = new Button("=");
        equal.setBounds(240,325, 75, 50);
        equal.addActionListener(this);

     

    // add frame
        // lble add
        frame.add(lbl);
        
        // button add
        // 1 row
        frame.add(clear);
        frame.add(c);
        frame.add(per);
        frame.add(div);
        
        // 2 row
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(mul);
        
        // 3 row
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(minus);
        
        // 4 row
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(plus);
        
        // 5 row
        frame.add(b0);
        frame.add(point);
        frame.add(equal);
        
     
   
        
        
        
        
        
        
        
        
        
        
    }
    
    
    public static void main(String[] args) {
        new Java_AWT_calculater();
    }

    @Override
    public void windowClosing(WindowEvent e) {
        frame.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1)
        {
            try
            {
                temp = lbl.getText();
                lbl.setText(temp+"1");
            }
            catch(Exception ex)
            {
                
            }
        }
        if(e.getSource() == b2)
        {
            try
            {
               temp = lbl.getText();
               lbl.setText(temp+"2");
            }
            catch(Exception ex)
            {
                
            }
        }
        if(e.getSource() == b3)
        {
            try
            {
               temp = lbl.getText();
               lbl.setText(temp+"3");
            }
            catch(Exception ex)
            {
                
            }
        }
        if(e.getSource() == b4)
        {
            try
            {
                temp = lbl.getText();
               lbl.setText(temp+"4");
            }
            catch(Exception ex)
            {
                
            }
        }
        if(e.getSource() == b5)
        {
            try
            {
               temp = lbl.getText();
               lbl.setText(temp+"5");   
            }
            catch(Exception ex)
            {
                
            }
        }if(e.getSource() == b6)
        {
            try
            {
               temp = lbl.getText();
               lbl.setText(temp+"6");
            }
            catch(Exception ex)
            {
                
            }
        }if(e.getSource() == b7)
        {
            try
            {
               temp = lbl.getText();
               lbl.setText(temp+"7"); 
            }
            catch(Exception ex)
            {
                
            }
        }
        if(e.getSource() == b8)
        {
            try
            {
               temp = lbl.getText();
               lbl.setText(temp+"8");
            }
            catch(Exception ex)
            {
                
            }
        }
        if(e.getSource() == b9)
        {
            try
            {
               temp = lbl.getText();
               lbl.setText(temp+"9");
            }
            catch(Exception ex)
            {
                
            }
        }if(e.getSource() == b0)
        {
            try
            {
               temp = lbl.getText();
               lbl.setText(temp+"0"); 
            }
            catch(Exception ex)
            {
                
            }
        }
        if(e.getSource() == plus)
        {
            try
            {
                n1 = Integer.parseInt(lbl.getText());
                operator = "+";
                lbl.setText("");
            }
            catch(Exception ex)
            {
                
            }
        }if(e.getSource() == minus)
        {
            try
            {
                 n1 = Integer.parseInt(lbl.getText());
                operator = "-";
                lbl.setText("");
            }
            catch(Exception ex)
            {
                
            }
        }if(e.getSource() == div)
        {
            
            try
            {
                n1 = Integer.parseInt(lbl.getText());
                operator = "/";
                lbl.setText(""); 
            }
            catch(Exception ex)
            {
                
            }
        }if(e.getSource() == mul)
        {
            try
            {
                 n1 = Integer.parseInt(lbl.getText());
                operator = "*";
                lbl.setText("");
            }
            catch(Exception ex)
            {
                
            }
        }
        if(e.getSource() == equal)
        {
            try
            {
                n2 = Integer.parseInt(lbl.getText());
                
                if(operator.equals("+"))
                {
                    ans = n1+n2;
                }
                if(operator.equals("-"))
                {
                    ans = n1-n2;
                }
                if(operator.equals("/"))
                {
                    ans = n1/n2;
                }
                if(operator.equals("*"))
                {
                    ans = n1*n2;
                }
                if(operator.equals("%"))
                {
                    int t = n1*n2;      
                }
                lbl.setText(""+ans);
            }
            catch(Exception ex)
            {
                
            }
        }
        if(e.getSource() == clear)
        {
            try
            {
                lbl.setText("");
            }
            catch(Exception ex)
            {
                
            }
        }
        if(e.getSource() == c)
        {
            try
            {
                String len = lbl.getText();
                len.length();
                String substr = len.substring(0,len.length()-1);
                lbl.setText(substr);
            }
            catch(Exception ex)
            {
                
            }
        }
 
    }
    
    
}
