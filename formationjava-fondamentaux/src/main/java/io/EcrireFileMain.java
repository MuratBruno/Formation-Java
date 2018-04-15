/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oandrade
 */
public class EcrireFileMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Test d'écriture de fichier");
        PrintWriter writer=null;
        try {
            writer = new PrintWriter("aecrire.txt");
            Scanner scan = new Scanner(System.in);
            for (String ligne = scan.nextLine(); !ligne.contains(":q"); ligne = scan.nextLine()) {
                writer.println(ligne);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EcrireFileMain.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(writer!=null){
                writer.flush();
                writer.close();
            }
        }
        
        File f = new File("/tmp", "test.txt");
        try {
            FileOutputStream fo = new FileOutputStream(f);
            BufferedOutputStream bos = new BufferedOutputStream(fo);
            PrintWriter pw = new PrintWriter(bos);
            //do something...
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EcrireFileMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
