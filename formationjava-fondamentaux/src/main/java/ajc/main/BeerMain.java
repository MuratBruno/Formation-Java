/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajc.main;

import ajc.model.Beer;

/**
 *
 * @author oandrade
 */
public class BeerMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Beer a = new Beer();
        Beer b = new Beer();
        a.setName("1664 Blanche");
        b.setName("Tourtel Twist");
        a.setAlcohol(true);
        b.setAlcohol(false);
        System.out.println("Je suis la bière "+a.getName());
        if (a.isAlcohol()){
            System.out.println("Je suis alcoolisée...");
        }else{
            System.out.println("Je suis sans alcool...");
        }
        
    }
    
}
