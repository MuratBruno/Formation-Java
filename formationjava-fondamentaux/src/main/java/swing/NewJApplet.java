/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import javax.swing.JApplet;
import javax.swing.JFrame;

/**
 *
 * @author oandrade
 */
public class NewJApplet extends JApplet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        JFrame mainFrame = new JTableTestFrame();
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
    // TODO overwrite start(), stop() and destroy() methods
}
