/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package animaux;

/**
 *
 * @author oandrade
 */
public class Escargot extends Animal{

    public Escargot() {
        super();
        cri = "Slurp....";
    }
    public Escargot(Sexe sexe){
        this();//appel du constructeur par défaut
        this.sexe=sexe;
        switch(sexe){
            case FEMELLE:
                cri = "Sluuuurrrrrppp !!!"; //cri plus féminin...
                break;
            case HERMAPHRODITE:
                cri = "SlurpSlurpSlurp !!!!!!";
            default :
                // c'est le cri du male par défaut...
                break;
        }
   }

    
    
    
}
