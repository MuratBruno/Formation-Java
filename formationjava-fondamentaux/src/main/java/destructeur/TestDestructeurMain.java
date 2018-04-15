/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package destructeur;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oandrade
 */
public class TestDestructeurMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        for (int i = 0; i < 1000000; i++) {
//            System.gc();
            new ClasseAvecDestructeur(i);
            
        }
            System.gc();

        
        
    }
}
