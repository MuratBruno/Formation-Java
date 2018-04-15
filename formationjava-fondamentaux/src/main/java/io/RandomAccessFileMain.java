/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.RandomAccessFile;

/**
 *
 * @author oandrade
 */
public class RandomAccessFileMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            //On écrit 10 valeurs de Double dans un fichier
            RandomAccessFile rf = new RandomAccessFile("rtest.dat", "rw");
            for (int i = 0; i < 10; i++) {
                rf.writeDouble(i * 1.414);
            }
            rf.close();

            //Affichage avant réécriture
            rf = new RandomAccessFile("rtest.dat", "r");
            for (int i = 0; i < 10; i++) {
                System.out.println(
                        "Value " + i + ": "
                        + rf.readDouble());
            }

            //Accès à la 5ième valeur et on l'écrase
            rf = new RandomAccessFile("rtest.dat", "rw");
            rf.seek(5 * 8);
            rf.writeDouble(47.0001);
            rf.close();

            //Affichage après la transformation
            rf = new RandomAccessFile("rtest.dat", "r");
            for (int i = 0; i < 10; i++) {
                System.out.println(
                        "Value " + i + ": "
                        + rf.readDouble());
            }
            rf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
