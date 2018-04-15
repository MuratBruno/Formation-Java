/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package socket;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Olivier Andrade - Aplose
 */
public class Sender implements Runnable {

    private PrintWriter pw;
    private String message = null;
    private String pseudo = null;
    Scanner sc = null;

    public Sender(PrintWriter pw) {
        this.pw = pw;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    @Override
    public void run() {
        sc = new Scanner(System.in);
        do{
            System.out.println(pseudo + " saisissez un message :");
            message = sc.nextLine();
            pw.println(message);
            pw.flush();
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {

            }
            
        }while(message!=null && !message.equals(":q"));
        
    }
}
