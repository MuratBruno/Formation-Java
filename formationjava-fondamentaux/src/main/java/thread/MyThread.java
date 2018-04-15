/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thread;

/**
 *
 * @author Olivier Andrade - Aplose
 */
public class MyThread extends Thread {
    private String name;
    public MyThread(String name){
        super();
        this.name=name;
    }
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        System.out.println("Start du Thread : "+name+" time : "+System.currentTimeMillis());
        // boucle tant que la durée de vie du thread est < à 10 secondes
        while( System.currentTimeMillis() < ( start + (1000 * 10))) {
            // traitement
            System.out.println("Hello from Thread : "+name);
           /* try {
                // pause
                this.sleep(500);
            }
            catch (InterruptedException ex) {}*/
        }
        System.out.println("Sortie du Thread : "+name+" time : "+System.currentTimeMillis());
    }
    

}
