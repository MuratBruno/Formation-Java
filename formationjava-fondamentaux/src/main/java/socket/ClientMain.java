/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oandrade
 */
public class ClientMain {

    public static Socket s = null;
    

    public static void main(String[] args) {
        try {
            System.out.println("Connexion en cours...");
            s = new Socket("192.168.210.19", 20000);
            System.out.println("Connexion établie...");
            Receiver rc = new Receiver(new BufferedReader(new InputStreamReader(s.getInputStream())));
            rc.setPseudo("Olivier Andrade receiver");
            Thread t1 = new Thread(rc);
            Sender sd = new Sender(new PrintWriter(s.getOutputStream()));
            sd.setPseudo("Olivier Andrade ");
            Thread t2 = new Thread(sd);
            t1.start();
            t2.start();
            while(t1.isAlive()&&t2.isAlive()){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ClientMain.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            rc.requireStop(true);
            
        } catch (UnknownHostException e) {
            System.err.println("Connexion impossible");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Aucun serveur sur le port 20000");
            e.printStackTrace();
        }
    }
}
