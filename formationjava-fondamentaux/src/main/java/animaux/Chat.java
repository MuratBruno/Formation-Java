/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package animaux;

/**
 *
 * @author oandrade
 */
public class Chat extends Animal{
    public Chat(){
        super();
        System.out.println("CONST CHAT SANS PARAM");
        cri = "Miaouh !";
    }
    @Override
    public void crier(){
        super.crier();
        super.crier();
    }
/*    public Chat(Sexe sexe){
        this();//appel du constructeur par défaut
        this.sexe=sexe;
        switch(sexe){
            case FEMELLE:
                cri = "Miiiiiaaaaaaaoooooouuuuuaaaa !!!"; //cri plus féminin...
                break;
            default :
                // c'est le cri du male par défaut...
                break;
        }
   }*/
    public Chat(Sexe sexe){
        super(sexe);
        System.out.println("CONST CHAT AVEC SEXE");
        switch(sexe){
            case FEMELLE:
                cri = "Miiiiiaaaaaaaoooooouuuuu !!!"; //cri plus féminin...
                break;
            default :
                // c'est le cri du male par défaut...
                break;
        }
    }

}
