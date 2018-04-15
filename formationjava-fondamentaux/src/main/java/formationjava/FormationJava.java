/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formationjava;

/**
 *
 * @author oandrade
 */
public class FormationJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i =  0 ; i < args.length; i++){
            System.out.println(args[i]);
        }
        Printer imp = new Printer();
        imp.setNom("Imp 1");
        System.out.println(imp.getNom());
    }
}
