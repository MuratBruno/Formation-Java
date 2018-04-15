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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Olivier Andrade - Aplose
 */
public class ServerThread implements Runnable {

    private static List<PrintWriter> writers = new ArrayList<>();
    private Socket s = null;
    private BufferedReader bfr = null;

    public ServerThread(Socket s) {
        this.s = s;

    }

    @Override
    public void run() {
        try {
            PrintWriter pw = new PrintWriter(s.getOutputStream());
            writers.add(pw);
            bfr = new BufferedReader(new InputStreamReader(s.getInputStream()));
            while (true) {
                String message = bfr.readLine();
                if (message != null) {
                    System.out.println("Serveur Thread : " + message);
                    sendMessage(message);
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public static synchronized void sendMessage(String message) {
        for (PrintWriter printWiter : writers) {
            printWiter.println(message);
            printWiter.flush();
        }
    }
}
