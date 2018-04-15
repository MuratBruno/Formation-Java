/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package animaux;

/**
 *
 * @author oandrade
 */
public class Cochon  extends Animal{
    public Cochon(){
        super();
        cri = "Groiiiinnnnnk !";
    }
    public Cochon(Sexe sexe){
        this();//appel du constructeur par défaut
        this.sexe=sexe;
        switch(sexe){
            case FEMELLE:
                cri = "Grouiiiiiiiikkkk !!!"; //cri plus féminin...
                break;
            default :
                // c'est le cri du male par défaut...
                break;
        }
   }
    
}
