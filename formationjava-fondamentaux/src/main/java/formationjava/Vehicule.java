/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package formationjava;

/**
 *
 * @author Olivier Andrade - Aplose
 */
public class Vehicule implements TelMobile, Television{
    @Override
    public void telephoner(String numero){
        System.out.println("Appel en cours du numéro : "+numero);
    }
    private String immatriculation;

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    @Override
    public void changerDeChaine(int chaine) {
        System.out.println("Changement de chaine "+chaine);
    }
    
    
    
}
