/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author oandrade
 */
public class TestThreadMain {

    /**
     * @param args the cmmand line arguments
     */
    public static void main(String[] args) {
        Thread t1 = new MyThread("THREAD1");
        Thread t2 = new MyThread("THREAD2");
 //       t1.setPriority(Thread.MIN_PRIORITY);
  //      t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();

    }
}
