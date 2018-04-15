/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import javax.swing.JApplet;

/**
 *
 * @author oandrade
 */
public class ImageApplet extends JApplet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        this.getContentPane().add(new ImageJPanel());
    }
    // TODO overwrite start(), stop() and destroy() methods
}
