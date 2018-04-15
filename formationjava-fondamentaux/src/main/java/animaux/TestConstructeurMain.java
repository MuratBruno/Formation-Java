/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package animaux;

/**
 *
 * @author oandrade
 */
public class TestConstructeurMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal a = new Chat();
        System.out.println();
        System.out.println();
        Animal b = new Chat(Sexe.FEMELLE);
    }
}
