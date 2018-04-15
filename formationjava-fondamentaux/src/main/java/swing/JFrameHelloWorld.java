/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author oandrade
 */
public class JFrameHelloWorld extends JFrame {

    public JFrameHelloWorld() {
        JMenuBar menuBar = new JMenuBar();
        JMenu fichierMenu = new JMenu("Fichier");
        JMenuItem menuItem = new JMenuItem("Exit");
        menuItem.addActionListener(new ActionListener(){   @Override
            public void actionPerformed(ActionEvent e) {
                exit();
            }
        });
        menuBar.add(fichierMenu);
        fichierMenu.add(menuItem);
        this.setJMenuBar(menuBar);
        
        JLabel helloWorldLabel = new JLabel("Hello World !");
        this.getContentPane().add(helloWorldLabel);
        this.pack();
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            }
        });
        this.setVisible(true);
    }
    
    public void exit(){
        System.exit(0);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame mainFrame = new JFrameHelloWorld();
    }
}
