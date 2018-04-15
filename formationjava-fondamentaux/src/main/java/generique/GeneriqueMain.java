/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package generique;

import animaux.Chat;

/**
 *
 * @author oandrade
 */
public class GeneriqueMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String item = "item à stocker";
        Chat c = new Chat();
        //sans générique
        CoffreFort cf = new CoffreFort();
        cf.setO(item);
        String recup = (String)cf.getO();
        //avec générique
        CoffreFortGenerique<String> cfg = new CoffreFortGenerique<>();
        cfg.setT(item);
        recup = cfg.getT();
        
        //
        cf.setO(c);
        
    }
}
