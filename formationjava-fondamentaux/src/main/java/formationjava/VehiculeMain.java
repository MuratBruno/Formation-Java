/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formationjava;

/**
 *
 * @author oandrade
 */
public class VehiculeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicule v = new Voiture();
        v.setImmatriculation("16599vx33");
        Voiture v2 = new Voiture();
        v2.setImmatriculation("156494vd33");
        v2.setNbPortes(5);
        System.out.println("v : "+v.getImmatriculation());
        System.out.println("v2 : "+v2.getImmatriculation());
        if (v instanceof Voiture){
            System.out.println("v nbportes : "+((Voiture)v).getNbPortes());
        }
        
    }
}
