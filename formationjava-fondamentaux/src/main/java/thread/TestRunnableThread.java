/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author oandrade
 */
public class TestRunnableThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Runnable run1 = new MyRunnable("RUN1");
        Runnable run2 = new MyRunnable("RUN2");
        Thread t1 = new Thread(run1);
        Thread t2 = new Thread(run2);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}
