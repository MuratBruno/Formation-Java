/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package animaux;

/**
 *
 * @author oandrade
 */
public abstract class Animal {
    public void crier(){
        System.out.println(cri);
    }
    private static int count = 0;
    public static int getCount(){
        return count;
    }
    public Animal(){
        System.out.println("CONST ANIMAL SANS PARAM");
        count++;
    }
    public Animal(Sexe sexe){
        this();
        System.out.println("CONST ANIMAL AVEC SEXE");
        this.sexe=sexe;
    }
    String cri = "AAAAAARRRRRRRGGGGGG";
    Sexe sexe=Sexe.AUTRE;
    public Sexe getSexe(){
        return sexe;
    }
}
