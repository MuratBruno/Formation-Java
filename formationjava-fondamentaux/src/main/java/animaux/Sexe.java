/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package animaux;

/**
 *
 * @author oandrade
 */
public enum Sexe {
    MALE("M","Mâle"),
    FEMELLE("F","Femelle"),
    AUTRE("A","Autre"),
    HERMAPHRODITE("H","Hermaphrodite");
    private String symbole;
    private String nom;
    Sexe(String symbole, String nom){
        this.symbole=symbole;
        this.nom=nom;
    }
    @Override
    public String toString(){
        return "Sexe : "+nom+" ("+symbole+")";
    }
    public String getNom(){
        return nom;
    }
    public String getSymbole(){
        return symbole;
    }
}
