/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package animaux;

/**
 *
 * @author oandrade
 */
public class Chien  extends Animal{
    public Chien(){
        super();
        cri = "Wouaouuuuuuh !";
    }
    public Chien(Sexe sexe){
        this();//appel du constructeur par défaut
        this.sexe=sexe;
        switch(sexe){
            case FEMELLE:
                cri = "Wouuuaaaaaaaaaaa !!!"; //cri plus féminin...
                break;
            default :
                // c'est le cri du male par défaut...
                break;
        }
   }
    
}
