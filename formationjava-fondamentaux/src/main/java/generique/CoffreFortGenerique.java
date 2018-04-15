/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package generique;

/**
 *
 * @author Olivier Andrade - Aplose
 */
public class CoffreFortGenerique<T> {
    T t;
    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
}
