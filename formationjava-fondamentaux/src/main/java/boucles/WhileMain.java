/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package boucles;

import java.util.Scanner;

/**
 *
 * @author oandrade
 */
public class WhileMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        s=scanner.nextLine();
        while(!s.contains(":q")){
            System.out.println(s);
            s=scanner.nextLine();
        }
    }
}
