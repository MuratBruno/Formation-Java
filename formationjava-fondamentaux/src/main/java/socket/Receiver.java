/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package socket;

import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author Olivier Andrade - Aplose
 */
public class Receiver implements Runnable{
    private BufferedReader bfr;
    private String message = null;
    private String pseudo = null;
    private boolean stop = false;
    public void requireStop(boolean b){
        this.stop = b;
    }
    public Receiver(BufferedReader bfr){
        this.bfr=bfr;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    @Override
    public void run() {
        while(!stop){
            try {
                message = bfr.readLine();
                System.out.println(pseudo+" : "+message);
                Thread.sleep(500);
            } catch (IOException e) {
                stop=true;

            } catch (InterruptedException ie){
                stop=true;
            }
        }

    }

}
