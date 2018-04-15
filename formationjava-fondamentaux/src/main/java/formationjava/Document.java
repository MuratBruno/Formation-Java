/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package formationjava;

import java.util.concurrent.locks.ReentrantLock;


/**
 *
 * @author Olivier Andrade - Aplose
 */
public class Document {
    ReentrantLock lock = new ReentrantLock();
    public void open(){
        lock.lock();
    }
    public void close(){
        lock.unlock();
    }
    public boolean isClosed(){
        return !lock.isLocked();
    }
}
