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
public class DoWhileMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        do{
            s=scanner.nextLine();
            System.out.println(s);
        }
        while(!s.contains(":q"));
    }
}
