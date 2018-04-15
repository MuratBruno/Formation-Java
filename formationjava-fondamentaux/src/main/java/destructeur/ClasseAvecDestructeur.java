/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package destructeur;

/**
 *
 * @author Olivier Andrade - Aplose
 */
public class ClasseAvecDestructeur {
    int id = 0;
    public ClasseAvecDestructeur(int id){
        this.id=id;
    }
    @Override
    public void finalize() {
          System.out.println("Méthode de finalisation appelée par gc sur id:"+id);
    }
    

}
