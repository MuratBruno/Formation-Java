/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package animaux;

/**
 *
 * @author oandrade
 */
public class StaticMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Count : "+Animal.getCount());
        Animal a = new Chat();
        System.out.println("Count : "+Animal.getCount());
    }
}
