/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package socket;

import java.io.IOException;
import java.net.ServerSocket;

/**
 *
 * @author oandrade
 */
public class SocketServerMain {

    
    public final static int PORT = 20000;
    private static ServerSocket server;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            server = new ServerSocket(PORT);
            //on attend les clients ...
            while (true) {
                ServerThread st = new ServerThread(server.accept());
                Thread t = new Thread(st);
                t.start();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
