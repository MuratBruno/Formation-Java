/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author oandrade
 */
public class TestJFrameMain extends JFrame{
    JLabel label = new JLabel("HELLO !");
    public TestJFrameMain(){
       JButton button = new JButton("Open JFrame");
        button.addActionListener(new ActionListener() {
            
           

            @Override
            public void actionPerformed(ActionEvent e) {
                setLabel();
            }
        });
        this.getContentPane().add(label);
        this.getContentPane().add(button);
        this.pack();
        this.setVisible(true);
    }
    public void setLabel(){
        label.setText("GOOD BYE !");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           JFrame f = new TestJFrameMain();
    }
}
