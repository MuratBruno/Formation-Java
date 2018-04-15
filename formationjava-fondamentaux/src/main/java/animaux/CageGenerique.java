/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animaux;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oandrade
 */
public class CageGenerique<T> {
    List<T> animauxEnPrison = new ArrayList<T>();
    public List<T> getAnimaux(){
        return animauxEnPrison;
    }
    public void addAnimal(T animal){
        animauxEnPrison.add(animal);
    }
}
