/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.util.Map;

/**
 *
 * @author oandrade
 */
public class SystemMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (Map.Entry<String, String> en : System.getenv().entrySet()) {
            String key = en.getKey();
            String value = en.getValue();
            System.out.println(key+" = "+value);
        }
    }
}
