/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formationjava;

/**
 *
 * @author oandrade
 */
public class LockMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Document doc = new Document();
        doc.open();
        System.out.println("Le document est il fermé ? "+doc.isClosed());
        doc.close();
        System.out.println("Le document est il fermé ? "+doc.isClosed());
        
    }
}
