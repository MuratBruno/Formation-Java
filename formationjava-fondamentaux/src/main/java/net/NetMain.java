/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oandrade
 */
public class NetMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.aplose.com");
            Object o = url.getContent();
            BufferedReader bfr = new BufferedReader(new InputStreamReader(url.openStream()));
            for (String ligne = bfr.readLine(); ligne != null; ligne = bfr.readLine()) {
                System.out.println(ligne);
            }
        } catch (Exception ex) {
            Logger.getLogger(NetMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
