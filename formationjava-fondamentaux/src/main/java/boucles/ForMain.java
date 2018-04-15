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
public class ForMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(String s = scanner.nextLine();!s.contains(":q");s = scanner.nextLine()){
            System.out.println(s);
        }
    }
}
