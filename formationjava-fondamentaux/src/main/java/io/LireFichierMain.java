/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oandrade
 */
public class LireFichierMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Test de lecture de fichier");
        Reader reader = null;
        BufferedReader bfr;
        try {
            File f = new File("aecrire.txt");
            reader = new FileReader(f);
            bfr = new BufferedReader(reader);
            for (String ligne = bfr.readLine(); ligne != null; ligne = bfr.readLine()) {
                System.out.println(ligne);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LireFichierMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ioe) {
            Logger.getLogger(LireFichierMain.class.getName()).log(Level.SEVERE, null, ioe);
        } finally {
            try {
                reader.close();
            } catch (IOException ex) {
                Logger.getLogger(LireFichierMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
