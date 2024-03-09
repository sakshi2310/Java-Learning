                    
package java_awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Java_AWT extends WindowAdapter{
    
    Frame frame;
    Label lbl;
    Button btn;
    int cnt;
    Java_AWT()
    {
    // frame
        //create the frame object
        frame = new Frame("frame");
        frame.setSize(500,500);  // to fix the window size
        
    //make the frame visible
        frame.setVisible(true);
        
    //add the listener to call the lister for this class 
        frame.addWindowListener(this);
        frame.setLayout(null);
      
    // label 
        // create object of lable
        lbl = new Label("Label");
        lbl.setBounds(50, 50, 150, 30);
        lbl.setBackground(Color.yellow);
        lbl.setAlignment(Label.CENTER);
    
    // button
        
        // create button object
        btn = new Button("Click Me");
        btn.setBounds(50,90,150,30);
        
        // button click event
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cnt%2==0)
                {
                    lbl.setText("ON");
                }else
                {
                    lbl.setText("OFF");
                }
                cnt++;
                
            }
        });
        
    // add all objects in frame
        
        // label add
        frame.add(lbl);
        
        // button add
        frame.add(btn);
        
    }
    public static void main(String[] args)
    {
        new Java_AWT();
    }

    // to close the window override the method
    @Override
    public void windowClosing(WindowEvent e) {
        frame.dispose();
    }
    
    
    
}
