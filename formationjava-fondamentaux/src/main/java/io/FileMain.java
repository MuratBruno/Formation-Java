/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.File;

/**
 *
 * @author oandrade
 */
public class FileMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File[] files = File.listRoots();
        for (File f : files) {

            System.out.println(f.toString());
            File[] sousFiles = f.listFiles();
            if (sousFiles != null) {
                for (File sf : sousFiles) {
                    if (sf.isDirectory()) {
                        System.out.println("Répertoire : " + sf.toString());
                    } else {
                        System.out.println("Fichier : " + sf.toString());
                    }
                }
            }

        }

    }
}
